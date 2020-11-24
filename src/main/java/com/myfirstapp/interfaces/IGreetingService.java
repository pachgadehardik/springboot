package com.myfirstapp.interfaces;

import com.myfirstapp.Greeting;
import com.myfirstapp.model.User;

public interface IGreetingService{
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
}
