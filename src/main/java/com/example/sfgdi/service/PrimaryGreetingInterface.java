package com.example.sfgdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingInterface implements GreetingInterface {

    @Override
    public String sayGreeting() {
        return "Hello World! - Primary";
    }
}
