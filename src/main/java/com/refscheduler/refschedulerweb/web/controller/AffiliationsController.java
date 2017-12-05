package com.refscheduler.refschedulerweb.web.controller;

import com.refscheduler.refschedulerweb.web.constants.BackendUrlConstants;
import com.refscheduler.refschedulerweb.web.utils.BackendInteractionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class AffiliationsController {

    @Autowired
    private BackendUrlConstants backendUrlConstants;

    public AffiliationsController() {
        super();
    }


    @RequestMapping({"/affiliations"})
    public String showTimeslots(Map<String, Object> model) {
        String affiliationsUtl = backendUrlConstants.getAffiliationsUtl();
        String affiliations = BackendInteractionUtils.makeRequest(affiliationsUtl,"GET");
        model.put("responseTxt", affiliations);
        return "affiliations";
    }
}

