package com.spring.log.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String hello(){
        logger.info("hello!");
        return "hello!";
    }

    @GetMapping("/errora")
    public String error(){
        logger.error("error!");
        return "error!";
    }

    @GetMapping("/debug")
    public String debug(){
        logger.debug("debug!");
        return "debug!";
    }

    @GetMapping("/warn")
    public String warn(){
        logger.warn("warn!");
        return "warn!";
    }

    @GetMapping("/trace")
    public String trace(){
        logger.trace("trace!");
        return "trace!";
    }

}
