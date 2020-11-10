package com.jeffree.boot.hello.yml.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${jeffree.msg}")
    private String msg;

    @RequestMapping("msg")
    public String getMsg() {
        return msg;
    }

    @RequestMapping("/home")
    public String home(){
        return "hello Jeffree";
    }

}
