package com.theCuriousCoder.interview_practice_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    public EmployeeController() {
        System.out.println("EmployeeController bean created");
    }

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/{id}")
    public List<Employee> getEmployee(@PathVariable Long id) {
        return employeeService.getEmployee(id);
    }

    /* Code for exception scenario */
//    @GetMapping("/employee/{id}")
//    public Employee getEmployee(@PathVariable Long id) {
//        return employeeService.getEmployee(id);
//    }
}
