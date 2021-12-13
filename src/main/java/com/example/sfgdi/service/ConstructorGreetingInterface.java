package com.example.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingInterface implements GreetingInterface {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
