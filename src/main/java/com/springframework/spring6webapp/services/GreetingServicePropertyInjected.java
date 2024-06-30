package com.springframework.spring6webapp.services;

import org.springframework.stereotype.Service;

@Service("greetingServiceProperty")
public class GreetingServicePropertyInjected implements GreetingServices{


    @Override
    public String sayGreeting() {
        return "Greeting Service Property injection";
    }
}
