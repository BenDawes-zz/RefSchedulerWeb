package com.refscheduler.refschedulerweb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {


    public HomePageController() {
        super();
    }


    @RequestMapping({"/", "/index"})
    public String showHome() {
        return "index";
    }
}

