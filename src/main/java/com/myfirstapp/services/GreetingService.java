package com.myfirstapp.services;

import com.myfirstapp.Greeting;
import com.myfirstapp.interfaces.IGreetingService;
import com.myfirstapp.model.User;
import com.myfirstapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGreetingService {

    private static final String template="Hello, %s!!!";
    private static AtomicLong counter = new AtomicLong();

    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public Greeting addGreeting(User user) {
        String msg = String.format(template,(user.toString().isEmpty())?"Hello World":user.toString());
        return greetingRepository.save(new Greeting(counter.incrementAndGet(),msg));
    }

    @Override
    public Greeting getGreetingById(long id) {
        return greetingRepository.findById(id).get();
    }
}
