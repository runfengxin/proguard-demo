package com.example.proguarddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    public static final String str = "admin";

    @GetMapping("/aaa")
    public String a() {
        return "ok";
    }

    @GetMapping("/bbb")
    public String bbb() {
        return str;
    }
}
