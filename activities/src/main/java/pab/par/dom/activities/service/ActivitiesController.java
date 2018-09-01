package pab.par.dom.activities.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pab.par.dom.activities.logic.api.Activitymanagement;
import pab.par.dom.activities.logic.dto.SearchCriteria;

import java.io.IOException;

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
     * @return the list of all articles of the catalog
     */
    @RequestMapping(value = "/activities/{city}", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> getActivities(@PathVariable("city") String city,
                                                         @RequestParam("category") String category,
                                                         @RequestParam("location") String location,
                                                         @RequestParam("district") String district) throws IOException {

        return new ResponseEntity<>(this.activityManagement.getActivities(new SearchCriteria(city, category, location, district)), HttpStatus.OK);
    }

    /**
     * @return the article info by id
     */
/*    @RequestMapping(value = "/article/{id}", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> getArticle(@PathVariable("id") Long id) {

        return new ResponseEntity<>(this.catalogmanagement.getArticle(id), HttpStatus.OK);
    }*/

}
