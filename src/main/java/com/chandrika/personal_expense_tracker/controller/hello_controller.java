package com.chandrika.personal_expense_tracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello_controller {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Chandrika, I am your expense tracker";
    }
}
