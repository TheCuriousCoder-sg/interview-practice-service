package com.techconcepts.interview_practice_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api1")
    public String method1() throws TestException {
        throw new TestException("This is a test Exception1");
    }

    @GetMapping("/api2")
    public String method2() throws TestException {
        throw new TestException("This is a test Exception2");
    }

    @GetMapping("/api3")
    public String method3() throws TestException {
        throw new TestException("This is a test Exception3");
    }
}
