package com.sample.test.sample_test.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.test.sample_test.projection.UserProjection;

@RestController
@RequestMapping("/api")
public class AuthController {
    @GetMapping("/user")
    public UserProjection getUser(){
        UserProjection user=new UserProjection();
        user.setUsername("hari");
        return user;
    }
}
