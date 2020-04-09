package com.mydelka.mydelkaApp.controller;

import com.mydelka.mydelkaApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class EndPointController {
    private UserService userService;

    @Autowired
    public EndPointController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/registration")
    public boolean registerUser(
            String name, String lastName, String email, String password
    ) {
        return userService.registerUser(name, lastName, email, password);
    }
}
