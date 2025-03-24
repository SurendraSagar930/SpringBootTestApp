package com.suri.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String message(){
        return "Hello Jenkins Application Spring boot from develop";
    }
}
