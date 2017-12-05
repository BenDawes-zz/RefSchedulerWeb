package com.refscheduler.refschedulerweb.web.controller;

import com.refscheduler.refschedulerweb.web.constants.UrlConstants;
import com.refscheduler.refschedulerweb.web.utils.BackendInteractionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class TimeslotsController {

    @Autowired
    private UrlConstants urlConstants;

    public TimeslotsController() {
        super();
    }


    @RequestMapping({"/timeslots"})
    public String showTimeslots(Map<String, Object> model) {
        String timeslotsUrl = urlConstants.getTimeslotsUrl();
        String teams = BackendInteractionUtils.makeRequest(timeslotsUrl,"GET");
        model.put("responseTxt", teams);
        return "timeslots";
    }
}

