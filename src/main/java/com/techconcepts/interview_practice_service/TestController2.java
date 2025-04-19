package com.techconcepts.interview_practice_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController2 {

    @GetMapping("/api4")
    public void method4() throws TestException {
        int a = 1/0;
    }

    @GetMapping("/api5")
    public void method5() throws Exception {
        throw new Exception("This is generic exception");
    }
}
