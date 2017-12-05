package com.refscheduler.refschedulerweb.web.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.refscheduler.refschedulerweb.web.constants.BackendUrlConstants;
import com.refscheduler.refschedulerweb.web.utils.BackendInteractionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class PersonsController {

    @Autowired
    private BackendUrlConstants backendUrlConstants;

    public PersonsController() {
        super();
    }


    @RequestMapping({"/persons"})
    public String showTimeslots(Map<String, Object> model) {
        String personsUrl = backendUrlConstants.getPersonsUrl();
        JsonNode persons = BackendInteractionUtils.makeRequest(personsUrl,"GET");
        model.put("responseTxt", persons);
        return "persons";
    }
}

