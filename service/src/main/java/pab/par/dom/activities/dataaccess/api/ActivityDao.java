package pab.par.dom.activities.dataaccess.api;

import pab.par.dom.activities.logic.dto.Activity;

import java.io.IOException;
import java.util.List;

/**
 * Interface for the activity data access
 */
public interface ActivityDao {

    /**
     * Returns all the available activities for a given city
     * @param city the city to filter by
     * @return the list of activities
     * @throws IOException
     */
    List<Activity> getAll(String city) throws IOException;
}
