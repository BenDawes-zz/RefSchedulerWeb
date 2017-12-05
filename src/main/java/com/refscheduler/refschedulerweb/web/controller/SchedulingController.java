package com.refscheduler.refschedulerweb.web.controller;

import com.refscheduler.refschedulerweb.web.constants.UrlConstants;
import com.refscheduler.refschedulerweb.web.utils.BackendInteractionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class SchedulingController {

    @Autowired
    private UrlConstants urlConstants;

    public SchedulingController() {
        super();
    }


    @RequestMapping({"/schedule","/scheduling"})
    public String showScheduling() {
        return "scheduling";
    }
}

