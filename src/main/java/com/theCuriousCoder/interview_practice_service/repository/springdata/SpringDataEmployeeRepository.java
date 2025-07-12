package com.theCuriousCoder.interview_practice_service.repository.springdata;

import com.theCuriousCoder.interview_practice_service.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataEmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByNameAndDepartment(String name, String department);
}

