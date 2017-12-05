package com.refscheduler.refschedulerweb.web.controller;

import com.refscheduler.refschedulerweb.web.constants.UrlConstants;
import com.refscheduler.refschedulerweb.web.utils.BackendInteractionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class PersonsController {

    @Autowired
    private UrlConstants urlConstants;

    public PersonsController() {
        super();
    }


    @RequestMapping({"/persons"})
    public String showTimeslots(Map<String, Object> model) {
        String personsUrl = urlConstants.getPersonsUrl();
        String persons = BackendInteractionUtils.makeRequest(personsUrl,"GET");
        model.put("responseTxt", persons);
        return "persons";
    }
}

