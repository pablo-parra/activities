package pab.par.dom.activities.logic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pab.par.dom.activities.dataaccess.api.ActivityDao;
import pab.par.dom.activities.logic.api.Activitymanagement;
import pab.par.dom.activities.logic.dto.Activity;
import pab.par.dom.activities.logic.dto.SearchCriteria;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class ActivitymanagementImpl implements Activitymanagement{

    @Autowired
    private ActivityDao activityDao;

    @Override
    public List<Activity> getActivities(SearchCriteria criteria) throws IOException {

        List<Activity> activityList = this.activityDao.getAll(criteria.getCity());

        return filterList(activityList, criteria);

    }

    @Override
    public Activity findBest (SearchCriteria criteria, LocalDateTime startDatetime, LocalDateTime endDatetime) throws Exception {

        if(notSameDay(startDatetime, endDatetime)){
            throw new Exception ("The start datetime and end datetime must be the same day");
        }

        List<Activity> activityListByCategory = filterList(this.activityDao.getAll(criteria.getCity()), criteria);

        return getBestActivityByTime(activityListByCategory, startDatetime, endDatetime);
    }

    private List<Activity> filterList(List<Activity> activityList, SearchCriteria criteria){
        Stream<Activity> stream = activityList.stream();

        String category = criteria.getCategory();
        if (category != null && !category.isEmpty()){
            stream = stream.filter(a -> a.getCategory().equals(criteria.getCategory()));
        }

        String location = criteria.getLocation();
        if (location != null && !location.isEmpty()){
            stream = stream.filter(a -> a.getLocation().equals(criteria.getLocation()));
        }

        String district = criteria.getDistrict();
        if (district != null && !district.isEmpty()){
            stream = stream.filter(a -> a.getDistrict().equals(criteria.getDistrict()));
        }

        return stream.collect(Collectors.toList());
    }


    private Activity getBestActivityByTime(List<Activity> activityList, LocalDateTime targetStart, LocalDateTime targetEnd) {

        Activity bestActivity = null;

        activityList.removeIf(activity -> !fitsSchedule(activity, targetStart, targetEnd));

        if (activityList.size() > 1){
            bestActivity = Collections.max(activityList, Comparator.comparing(activity -> activity.getHoursSpent()));
        }else if (activityList.size() == 1){
            bestActivity = activityList.get(0);
        }

        return bestActivity;
    }

    private boolean notSameDay(LocalDateTime start, LocalDateTime end){

        return start.getDayOfYear() != end.getDayOfYear() ? true : false;
    }

    private boolean fitsSchedule(Activity activity, LocalDateTime targetStart, LocalDateTime targetEnd){
        boolean result = false;
        DayOfWeek targetDayOfWeek = targetStart.getDayOfWeek();
        List<String> openingHours = activity.getOpeningHours().getByIndex(targetDayOfWeek.getValue());

        int year = targetStart.getYear();
        Month month = targetStart.getMonth();
        int dayOfMonth = targetStart.getDayOfMonth();

        // let's assume the openingHours format is going to be always ok, no validation required :)
        for (String range : openingHours){
            String[] hours = range.split("-");
            String openTime = hours[0];
            String closeTime = hours[1];
            LocalDateTime activityStart = LocalDateTime.of(year, month, dayOfMonth, Integer.parseInt(openTime.split(":")[0]), Integer.parseInt(openTime.split(":")[1]));
            LocalDateTime activityEnd = LocalDateTime.of(year, month, dayOfMonth, Integer.parseInt(closeTime.split(":")[0]), Integer.parseInt(closeTime.split(":")[1]));

            Duration activityDuration = Duration.between(targetStart, targetEnd);
            Duration userVisitDuration = Duration.between(activityStart, activityEnd);


            if (isValidRange(targetStart, targetEnd, activityStart, activityEnd)){
                result = true;
                break;
            }
        }

        return result;
    }

    private boolean isValidRange(LocalDateTime targetStart, LocalDateTime targetEnd, LocalDateTime activityStart, LocalDateTime activityEnd){

        if (    (targetStart.isEqual(activityStart) || targetStart.isAfter(activityStart)) &&
                (targetEnd.isEqual(activityEnd) || targetEnd.isBefore(activityEnd))){
            return true;
        }else{
            return false;
        }
    }

}
