package com.theCuriousCoder.interview_practice_service;

import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;

import java.util.List;

@Repository
public class EmployeeRepository {
    public EmployeeRepository() {
        System.out.println("EmployeeRepository bean created");
    }

    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    public List<Employee> getEmployeeFromDb(Long id) {
        return entityManager.createQuery("select e from Employee e where e.id=:id", Employee.class)
                .setParameter("id", id)
                .getResultList();

    }

        /* Code for exception scenario */
//    public Employee getEmployeeFromDb(Long id) {
//        return entityManager.createQuery("select e from Employee e where e.id=:id", Employee.class)
//                .setParameter("id", id)
//                .getSingleResult();
//
//    }
}
