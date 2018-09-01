package pab.par.dom.activities.logic.api;

import pab.par.dom.activities.logic.dto.Activity;
import pab.par.dom.activities.logic.dto.SearchCriteria;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public interface Activitymanagement {

    List<Activity> getActivities(SearchCriteria criteria) throws IOException;

    Activity getActivityByCategoryDateAndTime(String category, Date date, String startTime, String endTime);
}
