package com.springframework.spring6webapp.controllers;

import com.springframework.spring6webapp.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("greetingServiceProperty")
    @Autowired
    GreetingServices greetingServices;

    public String sayHello()
    {
        return greetingServices.sayGreeting();
    }

}
