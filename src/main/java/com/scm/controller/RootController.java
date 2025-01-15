package com.scm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.scm.entities.User;
import com.scm.helpers.Helper;
import com.scm.services.UserService;

@ControllerAdvice
public class RootController {

    Logger logger = LoggerFactory.getLogger(RootController.class);

    private final UserService userService;

    public RootController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute
    public void addLoggedInUserInformation(Model model, Authentication authentication) {
        if (authentication == null) {
            return;
        }
        User loggedInUser = userService.getUserByEmail(Helper.getEmailOfLoggedInUser(authentication));

        logger.info("User logged in is : {}", loggedInUser.getEmail());

        model.addAttribute("loggedInUser", loggedInUser);
    }
}
