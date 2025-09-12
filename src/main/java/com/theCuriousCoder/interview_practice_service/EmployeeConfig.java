package com.theCuriousCoder.interview_practice_service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class EmployeeConfig {

    @Bean("EmployeeBean1")
    @Primary
    public Employee getEmployeeBean1() {
        Employee e1 = new Employee();
        e1.setId(1l);
        return e1;
    }

    @Bean("EmployeeBean2")
    public Employee getEmployeeBean2() {
        Employee e2 = new Employee();
        e2.setId(2l);
        return e2;
    }
}
