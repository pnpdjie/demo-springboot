package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
    Logger logger = LoggerFactory.getLogger(Logger.class);

    @GetMapping("/{name}")
    public String hello(@PathVariable String name) {
        return "hello:" + name;
    }

    @RequestMapping("/login")
    public String userLogin() {
        logger.info("log..........");
        return "login";
    }


}
