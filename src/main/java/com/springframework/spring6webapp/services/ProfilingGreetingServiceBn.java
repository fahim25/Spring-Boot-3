package com.springframework.spring6webapp.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("BN")
@Service("profilingService")
public class ProfilingGreetingServiceBn implements GreetingServices{

    @Override
    public String sayGreeting() {
        return "Kemon Acho? BN";
    }
}
