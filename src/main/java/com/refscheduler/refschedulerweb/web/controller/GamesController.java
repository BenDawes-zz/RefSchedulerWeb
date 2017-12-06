package com.refscheduler.refschedulerweb.web.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.refscheduler.refschedulerweb.web.constants.BackendUrlConstants;
import com.refscheduler.refschedulerweb.web.utils.BackendInteractionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class GamesController {

    @Autowired
    private BackendUrlConstants backendUrlConstants;

    public GamesController() {
        super();
    }


    @RequestMapping({"/games"})
    public String showTimeslots(Map<String, Object> model) {
        String gamesUrl = backendUrlConstants.getGamesUrl();
        JsonNode games = BackendInteractionUtils.makeRequest(gamesUrl,"GET");
        model.put("games", games);
        return "games";
    }
}

