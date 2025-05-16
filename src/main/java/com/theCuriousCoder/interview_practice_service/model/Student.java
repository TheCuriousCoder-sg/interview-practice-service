package com.theCuriousCoder.interview_practice_service.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    public Student() {
        System.out.println("Student bean created "+ this.hashCode());
    }
}
