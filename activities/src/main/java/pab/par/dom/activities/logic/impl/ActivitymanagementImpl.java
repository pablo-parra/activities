package pab.par.dom.activities.logic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pab.par.dom.activities.dataaccess.api.ActivityDao;
import pab.par.dom.activities.logic.api.Activitymanagement;
import pab.par.dom.activities.logic.dto.Activity;
import pab.par.dom.activities.logic.dto.SearchCriteria;

import java.io.IOException;
import java.util.Date;
import java.util.List;
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
    public Activity getActivityByCategoryDateAndTime(String category, Date date, String startTime, String endTime) {
        return null;
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
}
