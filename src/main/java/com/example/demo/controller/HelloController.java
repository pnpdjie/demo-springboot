package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @GetMapping("/{name}")
    public String hello(@PathVariable String name){
        return "hello:" +name;
    }

    @RequestMapping("/login")
    public String userLogin() {
        return "login";
    }


}
