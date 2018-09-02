package pab.par.dom.activities.logic.api;

import pab.par.dom.activities.logic.dto.Activity;
import pab.par.dom.activities.logic.dto.SearchCriteria;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * Interface for the activity management logic
 */
public interface Activitymanagement {

    /**
     * Retrieves all the activities that fit the search criteria
     * @param criteria contains the filters
     * @return a list of Activities
     * @throws IOException
     */
    List<Activity> getActivities(SearchCriteria criteria) throws IOException;

    /**
     * Finds the recommended activity for a given category and time range
     * @param criteria contains the filters
     * @param startDatetime the time expected to start the activity
     * @param endDatetime the time expected to end the activity
     * @return best activity found based on the criteria
     * @throws Exception
     */
    Activity findBest (SearchCriteria criteria, LocalDateTime startDatetime, LocalDateTime endDatetime) throws Exception;
}
