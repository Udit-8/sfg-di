package com.example.sfgdi.controllers;

import com.example.sfgdi.service.GreetingInterface;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingInterface greetingInterface;

    public ConstructorInjectedController(GreetingInterface greetingInterface) {
        this.greetingInterface = greetingInterface;
    }

    public String getGreeting(){
        return greetingInterface.sayGreeting();
    }
}
