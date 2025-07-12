package com.theCuriousCoder.interview_practice_service.repository.jpa;

import com.theCuriousCoder.interview_practice_service.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class JpaEmployeeRepository {

    @PersistenceContext
    private EntityManager em;

    public Employee findByNameAndDepartment(String name, String department) {
        String jpql = "FROM Employee WHERE name = :name AND department = :department";
        return em.createQuery(jpql, Employee.class)
                .setParameter("name", name)
                .setParameter("department", department)
                .getSingleResult();
    }
}

