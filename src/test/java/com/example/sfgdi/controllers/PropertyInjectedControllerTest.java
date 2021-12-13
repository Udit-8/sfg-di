package com.example.sfgdi.controllers;

import com.example.sfgdi.service.ConstructorGreetingInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    private PropertyInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingInterface = new ConstructorGreetingInterface();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}