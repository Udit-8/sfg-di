package com.example.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingInterface implements GreetingInterface{
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
