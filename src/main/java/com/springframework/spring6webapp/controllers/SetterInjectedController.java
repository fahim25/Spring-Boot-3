package com.springframework.spring6webapp.controllers;

import com.springframework.spring6webapp.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    @Autowired
    private GreetingServices greetingServices;


    public void setGreetingServices(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String sayHello(){
        return greetingServices.sayGreeting();
    }

}
