package com.example.sfgdi.controllers;

import com.example.sfgdi.service.GreetingInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingInterface greetingInterface;

    public String getGreeting(){
        return greetingInterface.sayGreeting();
    }
}
