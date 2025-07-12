package com.theCuriousCoder.interview_practice_service.service.springdata;

import com.theCuriousCoder.interview_practice_service.entity.Employee;
import com.theCuriousCoder.interview_practice_service.repository.springdata.SpringDataEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringDataEmployeeService {
    @Autowired
    private SpringDataEmployeeRepository repository;

    public Employee findByNameAndDepartment(String name, String department) {
        return repository.findByNameAndDepartment(name, department);
    }
}

