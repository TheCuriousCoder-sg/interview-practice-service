package com.theCuriousCoder.interview_practice_service;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
    public EmployeeRepository() {
        System.out.println("EmployeeRepository bean created " + this.hashCode());
    }
}
