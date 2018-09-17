package com.greenfoxacademy.helloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    AtomicLong atomicLong = new AtomicLong(1);

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam("name") String inputName) {
        return new Greeting(atomicLong.getAndIncrement(), "Hello " + inputName);
    }
}