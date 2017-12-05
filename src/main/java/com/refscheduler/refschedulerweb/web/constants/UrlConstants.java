package com.refscheduler.refschedulerweb.web.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Component
public class UrlConstants {
    @Value("${backend.server.url}")
    private String backendServerUrl;

    private String TEAMS_URL;

    public String getTeamsUrl() {
        return TEAMS_URL;
    }

    @PostConstruct
    public void init() {
        TEAMS_URL = backendServerUrl + "/teams";
    }
}