package com.springframework.spring6webapp.controllers.profiling;

import com.springframework.spring6webapp.controllers.ProfilingController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

//@ActiveProfiles("BN")
@SpringBootTest
class ProfilingControllerTestBn {

    @Autowired
    ProfilingController profilingController;

    @Test
    void sayGreeting() {
        System.out.println(profilingController.sayGreeting());
    }
}