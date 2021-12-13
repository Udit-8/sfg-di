package com.example.sfgdi.controllers;

import com.example.sfgdi.service.GreetingInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final GreetingInterface greetingInterface;

    public I18nController(@Qualifier("i18nService") GreetingInterface greetingInterface) {
        this.greetingInterface = greetingInterface;
    }

    public String sayHello(){
        return greetingInterface.sayGreeting();
    }
}
