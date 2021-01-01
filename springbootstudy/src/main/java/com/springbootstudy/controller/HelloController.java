package com.springbootstudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/testHello")
    public String helloWorld(){
        System.out.println("這是一個helloWorld");
        return "這是一個helloWorld";
    }
}
