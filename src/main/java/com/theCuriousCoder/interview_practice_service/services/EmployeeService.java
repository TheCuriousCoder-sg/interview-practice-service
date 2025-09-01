package com.theCuriousCoder.interview_practice_service.services;

import com.theCuriousCoder.interview_practice_service.model.Employee;
import com.theCuriousCoder.interview_practice_service.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> fetchAllEmployees(){
        return employeeRepository.getAllEmp();
    }
}
