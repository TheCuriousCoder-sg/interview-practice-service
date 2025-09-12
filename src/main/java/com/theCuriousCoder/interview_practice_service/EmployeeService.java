package com.theCuriousCoder.interview_practice_service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public EmployeeService() {
        System.out.println("EmployeeService bean created " + this.hashCode());
    }
}
