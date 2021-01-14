package com.springbootstudy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${book.name}")
    private String bookName;

    @RequestMapping("/testHello")
    public String helloWorld(){
        System.out.println("這是一個helloWorld");
        System.out.println("book name ="+bookName);
        return "這是一個helloWorld";
    }
}
