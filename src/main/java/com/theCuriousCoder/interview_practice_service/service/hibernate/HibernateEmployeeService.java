package com.theCuriousCoder.interview_practice_service.service.hibernate;

import com.theCuriousCoder.interview_practice_service.entity.Employee;
import com.theCuriousCoder.interview_practice_service.repository.hibernate.HibernateEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HibernateEmployeeService {
    @Autowired
    private HibernateEmployeeRepository repository;

    public Employee findByNameAndDepartment(String name, String department) {
        return repository.findByNameAndDepartment(name, department);
    }
}

