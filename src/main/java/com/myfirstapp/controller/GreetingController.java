package com.myfirstapp.controller;

import com.myfirstapp.Greeting;
import com.myfirstapp.interfaces.IGreetingService;
import com.myfirstapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
=======
import org.springframework.web.bind.annotation.*;
>>>>>>> greeting-app-save-retrieve-h2

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    private static final String template = "Hello, %s!!!";
    private static AtomicLong counter = new AtomicLong();

    @Autowired
    private IGreetingService greetingService;

<<<<<<< HEAD
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

=======
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
>>>>>>> greeting-app-save-retrieve-h2

}
