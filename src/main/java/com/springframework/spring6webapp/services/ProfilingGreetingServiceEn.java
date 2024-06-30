package com.springframework.spring6webapp.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("profilingService")
public class ProfilingGreetingServiceEn implements GreetingServices{

    @Override
    public String sayGreeting() {
        return "Hello Profiling in EN";
    }
}
