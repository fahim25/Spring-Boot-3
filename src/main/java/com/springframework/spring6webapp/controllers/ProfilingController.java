package com.springframework.spring6webapp.controllers;

import com.springframework.spring6webapp.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class ProfilingController {

    @Qualifier("profilingService")
    @Autowired
    private final GreetingServices greetingServices;

    public ProfilingController(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String sayGreeting()
    {
        return greetingServices.sayGreeting();
    }


}
