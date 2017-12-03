package com.refscheduler.refschedulerweb.web.controller;

import com.refscheduler.refschedulerweb.web.constants.UrlConstants;
import com.refscheduler.refschedulerweb.web.utils.BackendInteractionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class TeamsController {

    @Autowired
    private UrlConstants urlConstants;

    public TeamsController() {
        super();
    }


    @RequestMapping({"/teams"})
    public String showTeams(Map<String, Object> model) {
        String teamsUrl = urlConstants.getTeamsUrl();
        String teams = BackendInteractionUtils.makeRequest(teamsUrl,"GET");
        model.put("responseTxt", teams);
        return "teams";
    }
}

