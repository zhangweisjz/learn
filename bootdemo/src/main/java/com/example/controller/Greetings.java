package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by Sai on 4/18/2016.
 */


@RestController
@RequestMapping("/greetings")
public class Greetings {

    @RequestMapping("/home2")
    String hello(){
        return "Hello World " + LocalDateTime.now();
    }
}
