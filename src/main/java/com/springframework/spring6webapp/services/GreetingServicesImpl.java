package com.springframework.spring6webapp.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicesImpl implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello Every One from base service ";
    }
}
