package com.springframework.spring6webapp.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimary implements GreetingServices{

    @Override
    public String sayGreeting() {
        return "Hello from the primary bean";
    }
}
