package com.example.security_v2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello.";
    }

    @GetMapping("/helloV2")
    public String helloV2(HttpServletRequest request) {
        return "Hello V2. " + request.getSession().getId();
    }
}
