package com.theCuriousCoder.interview_practice_service.controller;

import com.theCuriousCoder.interview_practice_service.model.Employee;
import com.theCuriousCoder.interview_practice_service.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployess () {
        return employeeService.fetchAllEmployees() ;
    }
}
