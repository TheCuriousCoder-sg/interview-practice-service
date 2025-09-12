package com.theCuriousCoder.interview_practice_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    public EmployeeController() {
        System.out.println("EmployeeController bean created " + this.hashCode());
    }

    @Autowired
    private Employee employee;

    @GetMapping("/employee")
    public Long getEmployee() {
        return employee.getId();
    }

}
