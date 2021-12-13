package com.example.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile({"ES","default"})
public class I18nSpanishGreetingInterface implements GreetingInterface{

    @Override
    public String sayGreeting() {
        return "Hola Mundo! - ES";
    }
}
