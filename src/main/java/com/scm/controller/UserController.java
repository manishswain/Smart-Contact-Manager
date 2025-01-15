package com.scm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scm.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // user dashbaord page

    @RequestMapping(value = "/dashboard")
    public String userDashboard() {
        logger.info("User dashboard");
        return "user/dashboard";
    }

    // user profile page

    @RequestMapping(value = "/profile")
    public String userProfile(Model model, Authentication authentication) {
        logger.info("User profile");

        return "user/profile";
    }

    // user add contacts page

    // user view contacts

    // user edit contact

    // user delete contact

}