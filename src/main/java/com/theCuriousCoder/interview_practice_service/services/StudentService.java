package com.theCuriousCoder.interview_practice_service.services;

import com.theCuriousCoder.interview_practice_service.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private Student student;

    public StudentService() {
        System.out.println("Student Service object created at address "
        + this.hashCode());
    }

    public Student getStudent() {
        return student;
    }
}
