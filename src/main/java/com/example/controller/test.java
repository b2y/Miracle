package com.example.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/11/18.
 */
@RestController
@EnableAutoConfiguration
public class test {

    @RequestMapping (value = "/",method = RequestMethod.GET)
    public String index() {
        return "Hello World~!";
    }
}

