package com.example.sfgdi.controllers;

import com.example.sfgdi.service.ConstructorGreetingInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    private ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingInterface());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}