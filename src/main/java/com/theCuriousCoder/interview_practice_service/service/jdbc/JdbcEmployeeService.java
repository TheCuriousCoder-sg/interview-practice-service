package com.theCuriousCoder.interview_practice_service.service.jdbc;

import com.theCuriousCoder.interview_practice_service.entity.Employee;
import com.theCuriousCoder.interview_practice_service.repository.jdbc.JdbcEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JdbcEmployeeService {
    @Autowired
    private JdbcEmployeeRepository repository;

    public Employee findByNameAndDepartment(String name, String department) {
        return repository.findByNameAndDepartment(name, department);
    }
}
