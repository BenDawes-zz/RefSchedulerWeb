package com.refscheduler.refschedulerweb.web.controller;

import com.refscheduler.refschedulerweb.web.constants.BackendUrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SchedulingController {

    @Autowired
    private BackendUrlConstants backendUrlConstants;

    public SchedulingController() {
        super();
    }


    @RequestMapping({"/schedule","/scheduling"})
    public String showScheduling() {
        return "scheduling";
    }
}

