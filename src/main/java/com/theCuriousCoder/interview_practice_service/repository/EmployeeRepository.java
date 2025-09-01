package com.theCuriousCoder.interview_practice_service.repository;

import com.theCuriousCoder.interview_practice_service.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    public default List<Employee> getAllEmp(){
        return new ArrayList<>() ;
    }
}
