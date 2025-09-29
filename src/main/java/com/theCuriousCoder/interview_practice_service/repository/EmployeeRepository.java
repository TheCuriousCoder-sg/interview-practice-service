package com.theCuriousCoder.interview_practice_service.repository;

import com.theCuriousCoder.interview_practice_service.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Page<Employee> findByName(String name, Pageable pageable);
}
