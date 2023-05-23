package com.example.learningaws.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author i.fernandez@nchain.com
 * Copyright (c) 2018-2023 nChain Ltd
 */
@Controller
public class WelcomeController {

    @Value("${app.msg.welcome}")
    String msgWelcome;

    @GetMapping(path = "/welcome")
    public String welcome(Model model) {
        model.addAttribute("msgWelcome", msgWelcome);
        return "welcome";
    }

}
