package com.refscheduler.refschedulerweb.web.constants;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class FrontendUrlConstants {

    private static final Map<String,String> endpoints;
    static {
        endpoints = new HashMap<String, String>();
        endpoints.put("affiliations","/affiliations");
        endpoints.put("games","/games");
        endpoints.put("home","/index");
        endpoints.put("persons","/persons");
        endpoints.put("teams","/teams");
        endpoints.put("timeslots","/timeslots");
        endpoints.put("scheduling","/scheduling");
    }

    @ModelAttribute("endpoints")
    public static Map<String, String> endpoints() {
        return endpoints;
    }
}
