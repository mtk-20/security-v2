package com.example.security_v2.controller;

import com.example.security_v2.model.User;
import com.example.security_v2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        return service.createUser(user);
    }
}
