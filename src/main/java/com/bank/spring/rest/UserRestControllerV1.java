package com.bank.spring.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRestControllerV1 {
    @GetMapping
    public String getUserById() {
        return "User";
    }
}

































