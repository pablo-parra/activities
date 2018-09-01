package pab.par.dom.activities.dataaccess.api;

import pab.par.dom.activities.logic.dto.Activity;

import java.io.IOException;
import java.util.List;

public interface ActivityDao {

    List<Activity> getAll(String city) throws IOException;
}
