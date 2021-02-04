package com.springbootstudy.controller;

import com.springbootstudy.bean.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigurationProperties(ConfigBean.class)
@RestController
public class HelloController {

    @Autowired
    private ConfigBean configBean;

    @RequestMapping("/testHello")
    public String helloWorld(){
        return  "myname="+configBean.getName()+"age=="+configBean.getAge();
    }
}