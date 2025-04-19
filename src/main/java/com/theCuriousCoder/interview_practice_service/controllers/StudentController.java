package com.theCuriousCoder.interview_practice_service.controllers;

import com.theCuriousCoder.interview_practice_service.model.Student;
import com.theCuriousCoder.interview_practice_service.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    public StudentController() {
        System.out.println("Student Controller object created at address "
        + this.hashCode());
    }

    @GetMapping("/student")
    public int getStudentAddress() {
        Student s1 = studentService.getStudent();
        return s1.hashCode();
    }
}
