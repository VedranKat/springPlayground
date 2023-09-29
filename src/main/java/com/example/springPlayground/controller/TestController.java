package com.example.springPlayground.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {

    @GetMapping("/hello")
    public String test(){
        return "Hello World";
    }

    @GetMapping("/hello2")
    @PreAuthorize("hasRole('client_admin')")
    public String test2(){
        return "Hello World 2 -- ADMIN";
    }

}
