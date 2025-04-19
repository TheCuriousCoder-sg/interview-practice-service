package com.theCuriousCoder.interview_practice_service.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    public EmployeeController() {
        System.out.println("Employee Controller bean");
    }
}
