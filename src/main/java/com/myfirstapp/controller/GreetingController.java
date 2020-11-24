package com.myfirstapp.controller;

import com.myfirstapp.Greeting;
import com.myfirstapp.interfaces.IGreetingService;
import com.myfirstapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    private static final String template="Hello, %s!!!";
    private static AtomicLong counter = new AtomicLong();

    @Autowired
    private IGreetingService greetingService;

    @GetMapping(value={"","/","/greetings"})
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        User user = new User();
        user.setFirstName(name);
        return greetingService.addGreeting(user);
    }

    @GetMapping(value={"/id"})
    public Greeting greeting(@RequestParam(value = "Id") Long Id){
        return greetingService.getGreetingById(Id);
    }


//    @RequestMapping("/greeting")
//    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
//         return new Greeting(counter.incrementAndGet(),String.format(template,name));
//    }


}
