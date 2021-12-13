package com.example.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile("EN")
public class I18nEnglishGreetingInterface implements GreetingInterface{

    @Override
    public String sayGreeting() {
        return "Hello World! - EN";
    }
}
