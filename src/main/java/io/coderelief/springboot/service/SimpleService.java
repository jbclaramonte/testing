package io.coderelief.springboot.service;

import io.coderelief.springboot.model.Message;
import io.coderelief.springboot.model.User;
import org.springframework.stereotype.Service;

@Service
public class SimpleService {

    public User loadUser() {
        User user = new User("John", "Doe", "user address here");
        user.setFirstname("John");
        user.setLastname("Doe");
        user.setAddress("user address here");

        Message msg = new Message();
        msg.setContent("hello how are you ?");
        msg.setFrom(new User("Bob", "sponge", "ocean"));
        user.getMessages().add(msg);

        return user;
    }

}