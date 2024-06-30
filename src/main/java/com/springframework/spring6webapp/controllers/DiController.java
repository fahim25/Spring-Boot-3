package com.springframework.spring6webapp.controllers;

import com.springframework.spring6webapp.services.GreetingServices;
import com.springframework.spring6webapp.services.GreetingServicesImpl;
import org.springframework.stereotype.Controller;

@Controller
public class DiController  {

    private final GreetingServices greetingServices;

    public DiController() {
        this.greetingServices = new GreetingServicesImpl();
    }

    public String sayHello(){
        System.out.println("In the DI controller!");

        return  greetingServices.sayGreeting();

    }

}



