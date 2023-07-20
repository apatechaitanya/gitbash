package com.chaitanya.demo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class DemoController {

    @GetMapping("/g")
    public String getData(){
        log.info("In getdata()");
        return "Hi Chaitanya";
    }
}
