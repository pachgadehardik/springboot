package com.myfirstapp.interfaces;

import com.myfirstapp.Greeting;
import com.myfirstapp.model.User;

import java.util.List;

public interface IGreetingService{
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
    List<Greeting> getAllGreetings();
    void deleteGreeting(long id);
    Greeting editGreeting(Greeting greeting);
}
