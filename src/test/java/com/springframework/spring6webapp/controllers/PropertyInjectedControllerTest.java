package com.springframework.spring6webapp.controllers;

import com.springframework.spring6webapp.services.GreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController propertyInjectedController;

//    @BeforeEach
//    void setUp() {
//
//        propertyInjectedController = new PropertyInjectedController();
//        propertyInjectedController.greetingServices = new GreetingServicesImpl();
//
//    }

    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}