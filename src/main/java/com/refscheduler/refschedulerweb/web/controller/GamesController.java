package com.refscheduler.refschedulerweb.web.controller;

import com.refscheduler.refschedulerweb.web.constants.UrlConstants;
import com.refscheduler.refschedulerweb.web.utils.BackendInteractionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class GamesController {

    @Autowired
    private UrlConstants urlConstants;

    public GamesController() {
        super();
    }


    @RequestMapping({"/games"})
    public String showTimeslots(Map<String, Object> model) {
        String gamesUrl = urlConstants.getGamesUrl();
        String games = BackendInteractionUtils.makeRequest(gamesUrl,"GET");
        model.put("responseTxt", games);
        return "games";
    }
}

