package com.example.sfgdi.controllers;

import com.example.sfgdi.service.GreetingInterface;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingInterface greetingInterface;

    public MyController(GreetingInterface greetingInterface) {
        this.greetingInterface = greetingInterface;
    }

    public String sayHello(){
        return greetingInterface.sayGreeting();
    }
}
