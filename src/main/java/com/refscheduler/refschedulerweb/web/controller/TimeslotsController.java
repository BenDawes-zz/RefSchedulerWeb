package com.refscheduler.refschedulerweb.web.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.refscheduler.refschedulerweb.web.constants.BackendUrlConstants;
import com.refscheduler.refschedulerweb.web.utils.BackendInteractionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class TimeslotsController {

    @Autowired
    private BackendUrlConstants backendUrlConstants;

    public TimeslotsController() {
        super();
    }


    @RequestMapping({"/timeslots"})
    public String showTimeslots(Map<String, Object> model) {
        String timeslotsUrl = backendUrlConstants.getTimeslotsUrl();
        JsonNode timeslots = BackendInteractionUtils.makeRequest(timeslotsUrl,"GET");
        model.put("timeslots", timeslots);
        return "timeslots";
    }
}

