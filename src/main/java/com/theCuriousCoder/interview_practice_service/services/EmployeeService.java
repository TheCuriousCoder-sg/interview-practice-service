package com.theCuriousCoder.interview_practice_service.services;

import com.theCuriousCoder.interview_practice_service.model.Employee;
import com.theCuriousCoder.interview_practice_service.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> fetchAllEmployees(Pageable pageable, String search) {
        if(search==null) {
            return employeeRepository.findAll(pageable).getContent();
        } else {
            return employeeRepository.findByName(search, pageable).getContent();
        }
    }
}
