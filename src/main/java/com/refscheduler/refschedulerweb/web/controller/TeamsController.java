package com.refscheduler.refschedulerweb.web.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.refscheduler.refschedulerweb.web.constants.BackendUrlConstants;
import com.refscheduler.refschedulerweb.web.utils.BackendInteractionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class TeamsController {

    @Autowired
    private BackendUrlConstants backendUrlConstants;

    public TeamsController() {
        super();
    }


    @RequestMapping({"/teams"})
    public String showTeams(Map<String, Object> model) {
        String teamsUrl = backendUrlConstants.getTeamsUrl();
        JsonNode teams = BackendInteractionUtils.makeRequest(teamsUrl,"GET");
        model.put("teams", teams);
        return "teams";
    }
}

