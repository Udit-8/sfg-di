package com.example.sfgdi.controllers;

import com.example.sfgdi.service.ConstructorGreetingInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    private SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingInterface(new ConstructorGreetingInterface());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}