package com.theCuriousCoder.interview_practice_service.controller;

import com.theCuriousCoder.interview_practice_service.model.Employee;
import com.theCuriousCoder.interview_practice_service.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/list")
    public List<Employee> getEmployees(@RequestParam(required = false, defaultValue = "1") int pageNo,
                                       @RequestParam(required = false, defaultValue = "5") int pageSize,
                                       @RequestParam(required = false, defaultValue = "id") String sortBy,
                                       @RequestParam(required = false, defaultValue = "ASC") String sortDir,
                                       @RequestParam(required = false) String search) {
        Sort sort = null;
        if(sortDir.equalsIgnoreCase("ASC")) {
            sort = Sort.by(sortBy).ascending();
        } else {
            sort = Sort.by(sortBy).descending();
        }
        return employeeService.fetchAllEmployees(PageRequest.of(pageNo-1,pageSize, sort), search);
    }
}
