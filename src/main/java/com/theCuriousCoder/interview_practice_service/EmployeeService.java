package com.theCuriousCoder.interview_practice_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    public EmployeeService() {
        System.out.println("EmployeeService bean created");
    }

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployee(Long id) {
        return employeeRepository.getEmployeeFromDb(id);
    }


        /*  Code for Exception scenario */
//    public Employee getEmployee(Long id) {
//        try {
//            return employeeRepository.getEmployeeFromDb(id);
//        } catch (Exception e) {
//            System.out.println("Exception class: " + e.getClass());
//        }
//        return null;
//    }
}
