package com.mdf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String getGreetings(){
        return "App is up and running for context '/'";
    }

    @RequestMapping("/mdf")
    public String getMDFPAth(){
        return " Path '/mdf' working";
    }

}
