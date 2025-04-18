package com.theCuriousCoder.interview_practice_service;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    private List<Employee> employees = new ArrayList<>();

    @GetMapping("/message")
    public String getMessage() {
        return "This is my first API";
    }

    @GetMapping("/employee")
    public List<Employee> getEmployee() {
        return employees;
    }

    @PostMapping("/employee")
    public void saveEmployee(@RequestBody Employee employee) {
        employees.add(employee);
    }

    @PostMapping("/employee")
    public void deleteEmployee(@RequestParam Long id) {
        for(int i=0; i<employees.size(); i++) {
            if(employees.get(i).getId()==id) {
                employees.remove(i);
            }
        }
    }

    @PutMapping("/employee/{id}")
    public void updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        for(int i=0; i<employees.size(); i++) {
            if(employees.get(i).getId()==id) {
                employees.set(i, employee);
            }
        }
    }


}
