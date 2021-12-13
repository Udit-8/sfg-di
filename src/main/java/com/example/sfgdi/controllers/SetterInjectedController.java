package com.example.sfgdi.controllers;

import com.example.sfgdi.service.GreetingInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingInterface greetingInterface;

    @Qualifier("setterGreetingInterface")
    @Autowired
    public void setGreetingInterface(GreetingInterface greetingInterface) {
        this.greetingInterface = greetingInterface;
    }

    public String getGreeting(){
        return greetingInterface.sayGreeting();
    }
}
