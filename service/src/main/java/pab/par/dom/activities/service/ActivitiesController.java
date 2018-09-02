package pab.par.dom.activities.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pab.par.dom.activities.logic.api.Activitymanagement;
import pab.par.dom.activities.logic.dto.SearchCriteria;

import java.io.IOException;
import java.time.LocalDateTime;

/**
 * REST controller for Activities service
 *
 */
@Controller
@RequestMapping("api/v1")
public class ActivitiesController {

    @Autowired
    private Activitymanagement activityManagement;

    /**
     * @return the list of all activities that fit the provided filters
     */
    @RequestMapping(value = "/activities/{city}", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> getActivities(@PathVariable("city") String city,
                                                         @RequestParam(value = "category", required = false) String category,
                                                         @RequestParam(value = "location", required = false) String location,
                                                         @RequestParam(value = "district", required = false) String district) throws IOException {

        return new ResponseEntity<>(this.activityManagement.getActivities(new SearchCriteria(city, category, location, district)), HttpStatus.OK);
    }

    /**
     * @return the recommended Activity based on the provided preferences
     */
    @RequestMapping(value = "/activities/{city}/findBest/{category}/{startDatetime}/{endDatetime}", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> findBest(@PathVariable("city") String city,
                                                    @PathVariable("category") String category,
                                                    @PathVariable("startDatetime")
                                                        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDatetime,

                                                    @PathVariable("endDatetime")
                                                        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDatetime) throws Exception {

        return new ResponseEntity<>(this.activityManagement.findBest(new SearchCriteria(city, category, null, null), startDatetime, endDatetime), HttpStatus.OK);
    }

}
