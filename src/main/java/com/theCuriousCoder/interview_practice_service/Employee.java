package com.theCuriousCoder.interview_practice_service;

public class Employee {
    private Long id;
    public Employee() {
        System.out.println("Employee bean created " + this.hashCode());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
