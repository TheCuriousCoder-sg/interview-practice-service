package com.theCuriousCoder.interview_practice_service.controller;

import com.theCuriousCoder.interview_practice_service.model.Student;
import com.theCuriousCoder.interview_practice_service.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Scope("session")
public class StudentController {
    @Autowired
    private Student student;

    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public void getStudent() {
        System.out.println("H1: " + student.hashCode());
        System.out.println("H2: " + studentService.getStudent().hashCode());
    }
}
