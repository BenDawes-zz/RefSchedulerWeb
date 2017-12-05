package com.refscheduler.refschedulerweb.web.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Component
public class UrlConstants {
    @Value("${backend.server.url}")
    private String backendServerUrl;

    private String TEAMS_URL;
    private String TIMESLOTS_URL;
    private String PERSONS_URL;
    private String GAMES_URL;
    private String AFFILIATIONS_URL;


    @PostConstruct
    public void init() {
        TEAMS_URL = backendServerUrl + "/teams";
        TIMESLOTS_URL = backendServerUrl + "/timeslots";
        PERSONS_URL = backendServerUrl + "/persons";
        GAMES_URL = backendServerUrl + "/game";
        AFFILIATIONS_URL = backendServerUrl + "/affiliations";

    }

    public String getTeamsUrl() {
        return TEAMS_URL;
    }

    public String getTimeslotsUrl() { return TIMESLOTS_URL; }
    
    public String getPersonsUrl() { return PERSONS_URL; }

    public String getGamesUrl() { return GAMES_URL; }

    public String getAffiliationsUtl() { return AFFILIATIONS_URL; }
}