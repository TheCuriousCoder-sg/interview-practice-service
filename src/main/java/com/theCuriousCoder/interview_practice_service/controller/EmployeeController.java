package com.theCuriousCoder.interview_practice_service.controller;

import com.theCuriousCoder.interview_practice_service.entity.Employee;
import com.theCuriousCoder.interview_practice_service.service.hibernate.HibernateEmployeeService;
import com.theCuriousCoder.interview_practice_service.service.jdbc.JdbcEmployeeService;
import com.theCuriousCoder.interview_practice_service.service.jpa.JpaEmployeeService;
import com.theCuriousCoder.interview_practice_service.service.springdata.SpringDataEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private JdbcEmployeeService jdbcService;

    @Autowired
    private HibernateEmployeeService hibernateService;

    @Autowired
    private JpaEmployeeService jpaService;

    @Autowired
    private SpringDataEmployeeService springDataService;

    @GetMapping("/jdbc")
    public Employee getEmployeeViaJdbc(@RequestParam String name, @RequestParam String department) {
        return jdbcService.findByNameAndDepartment(name, department);
    }

    @GetMapping("/hibernate")
    public Employee getEmployeeViaHibernate(@RequestParam String name, @RequestParam String department) {
        return hibernateService.findByNameAndDepartment(name, department);
    }

    @GetMapping("/jpa")
    public Employee getEmployeeViaJpa(@RequestParam String name, @RequestParam String department) {
        return jpaService.findByNameAndDepartment(name, department);
    }

    @GetMapping("/spring-data-jpa")
    public Employee getEmployeeViaSpringDataJpa(@RequestParam String name, @RequestParam String department) {
        return springDataService.findByNameAndDepartment(name, department);
    }
}

