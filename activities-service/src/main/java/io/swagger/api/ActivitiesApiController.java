package io.swagger.api;

import io.swagger.model.Activity;
import org.threeten.bp.LocalDate;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-31T16:22:32.898Z")

@Controller
public class ActivitiesApiController implements ActivitiesApi {

    private static final Logger log = LoggerFactory.getLogger(ActivitiesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ActivitiesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Activity>> activitiesCityGet(@ApiParam(value = "City to filter by",required=true) @PathVariable("city") String city,@ApiParam(value = "Category value to filter by") @Valid @RequestParam(value = "category", required = false) String category,@ApiParam(value = "Location value to filter by") @Valid @RequestParam(value = "location", required = false) String location,@ApiParam(value = "District value to filter by") @Valid @RequestParam(value = "district", required = false) String district) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Activity>>(objectMapper.readValue("[ {  \"hours_spent\" : 0.8008282,  \"district\" : \"district\",  \"name\" : \"name\",  \"opening_hours\" : {    \"tu\" : [ \"tu\", \"tu\" ],    \"mo\" : [ \"mo\", \"mo\" ],    \"su\" : [ \"su\", \"su\" ],    \"th\" : [ \"th\", \"th\" ],    \"fr\" : [ \"fr\", \"fr\" ],    \"we\" : [ \"we\", \"we\" ],    \"sa\" : [ \"sa\", \"sa\" ]  },  \"location\" : \"location\",  \"category\" : \"category\",  \"latlng\" : \"\"}, {  \"hours_spent\" : 0.8008282,  \"district\" : \"district\",  \"name\" : \"name\",  \"opening_hours\" : {    \"tu\" : [ \"tu\", \"tu\" ],    \"mo\" : [ \"mo\", \"mo\" ],    \"su\" : [ \"su\", \"su\" ],    \"th\" : [ \"th\", \"th\" ],    \"fr\" : [ \"fr\", \"fr\" ],    \"we\" : [ \"we\", \"we\" ],    \"sa\" : [ \"sa\", \"sa\" ]  },  \"location\" : \"location\",  \"category\" : \"category\",  \"latlng\" : \"\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Activity>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Activity>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Activity> getActivityByTime(@ApiParam(value = "City to filter by",required=true) @PathVariable("city") String city,@ApiParam(value = "The preferred category for to filter activities",required=true) @PathVariable("category") String category,@ApiParam(value = "Date of the desired day",required=true) @PathVariable("date") LocalDate date,@ApiParam(value = "Desired hour to start the activity",required=true) @PathVariable("startTime") String startTime,@ApiParam(value = "Desired hour to end the activity",required=true) @PathVariable("endTime") String endTime) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Activity>(objectMapper.readValue("{  \"hours_spent\" : 0.8008282,  \"district\" : \"district\",  \"name\" : \"name\",  \"opening_hours\" : {    \"tu\" : [ \"tu\", \"tu\" ],    \"mo\" : [ \"mo\", \"mo\" ],    \"su\" : [ \"su\", \"su\" ],    \"th\" : [ \"th\", \"th\" ],    \"fr\" : [ \"fr\", \"fr\" ],    \"we\" : [ \"we\", \"we\" ],    \"sa\" : [ \"sa\", \"sa\" ]  },  \"location\" : \"location\",  \"category\" : \"category\",  \"latlng\" : \"\"}", Activity.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Activity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Activity>(HttpStatus.NOT_IMPLEMENTED);
    }

}
