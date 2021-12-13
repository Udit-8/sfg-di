package com.example.sfgdi.controllers;

import com.example.sfgdi.service.GreetingInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingInterface")
    @Autowired
    public GreetingInterface greetingInterface;

    public String getGreeting(){
        return greetingInterface.sayGreeting();
    }
}
