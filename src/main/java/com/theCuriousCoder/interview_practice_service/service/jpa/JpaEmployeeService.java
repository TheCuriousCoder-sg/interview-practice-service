package com.theCuriousCoder.interview_practice_service.service.jpa;

import com.theCuriousCoder.interview_practice_service.entity.Employee;
import com.theCuriousCoder.interview_practice_service.repository.jpa.JpaEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JpaEmployeeService {
    @Autowired
    private JpaEmployeeRepository repository;

    public Employee findByNameAndDepartment(String name, String department) {
        return repository.findByNameAndDepartment(name, department);
    }
}

