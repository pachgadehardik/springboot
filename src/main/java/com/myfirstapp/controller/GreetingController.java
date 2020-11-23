package com.myfirstapp.controller;

import com.myfirstapp.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/hello")
public class GreetingController {

    private static final String template="Hello, %s!!!";
    private static AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
         return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }
}
