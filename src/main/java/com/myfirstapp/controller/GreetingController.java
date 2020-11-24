package com.myfirstapp.controller;

import com.myfirstapp.Greeting;
import com.myfirstapp.interfaces.IGreetingService;
import com.myfirstapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    private static final String template = "Hello, %s!!!";
    private static AtomicLong counter = new AtomicLong();

    @Autowired
    private IGreetingService greetingService;

    @GetMapping(value = {"", "/", "/greetings"})
    public Greeting greeting(@RequestParam(value = "fname", defaultValue = "World") String fname) {
        User user = new User();
        user.setFirstName(fname);
        return greetingService.addGreeting(user);
    }

    @GetMapping(value = {"/id"})
    public Greeting greeting(@RequestParam(value = "Id") Long Id) {
        return greetingService.getGreetingById(Id);
    }

    @GetMapping(value = {"/getAll"})
    public List<Greeting> greeting(){
        return greetingService.getAllGreetings();
    }

    @GetMapping(value = {"/deletegreeting"})
    public void deleteGreetingById(@RequestParam(value = "Id") Long Id){
        greetingService.deleteGreeting(Id);
    }

    @PutMapping(value = {"/edit"})
    public void edit(@RequestBody Greeting greeting){
        greetingService.editGreeting(greeting);
    }

}
