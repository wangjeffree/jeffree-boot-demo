package com.jeffree.boot.hello.yml.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

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

    @RequestMapping("/log")
    public void log(){
        logger.trace("----------trace-----------");
        logger.debug("----------debug-----------");
        logger.info("----------info-----------");
        logger.warn("----------warn-----------");
        logger.error("----------error-----------");
    }
}

