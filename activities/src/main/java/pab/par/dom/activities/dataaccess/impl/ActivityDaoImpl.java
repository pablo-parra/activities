package pab.par.dom.activities.dataaccess.impl;

import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;
import pab.par.dom.activities.dataaccess.api.ActivityDao;
import pab.par.dom.activities.logic.dto.Activity;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class ActivityDaoImpl implements ActivityDao{

    private static final Logger LOG = LoggerFactory.getLogger(ActivityDaoImpl.class);

    @Override
    public List<Activity> getAll(String city) throws IOException {

        // Here we could implement a mechanism to get activities based on the provided city.
        // In this example we will use always 'madrid'
        ClassLoader classLoader = getClass().getClassLoader();
        List<Activity> activityList = new ArrayList();

        try {
            LOG.info("Getting activities...");
            String fileContent = IOUtils.toString(classLoader.getResourceAsStream("madrid.json"), Charset.defaultCharset());
            activityList = Arrays.asList(new Gson().fromJson(fileContent, Activity[].class));
            return activityList;
        } catch (IOException e) {
            throw e;
        }

    }
}
