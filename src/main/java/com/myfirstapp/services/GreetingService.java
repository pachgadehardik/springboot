package com.myfirstapp.services;

import com.myfirstapp.Greeting;
import com.myfirstapp.interfaces.IGreetingService;
import com.myfirstapp.model.User;
import com.myfirstapp.repository.GreetingRepository;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

=======
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
>>>>>>> greeting-app-save-retrieve-h2
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
<<<<<<< HEAD
=======

    @Override
    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }

    @Override
    public void deleteGreeting(long id) {
        System.out.println("Inside Delete Service");
        greetingRepository.deleteById(id);
    }

    @Override
    public Greeting editGreeting(Greeting greeting) {
        return greetingRepository.save(greeting);
    }
>>>>>>> greeting-app-save-retrieve-h2
}
