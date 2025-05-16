package com.theCuriousCoder.interview_practice_service.controller;

import com.theCuriousCoder.interview_practice_service.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("prototype")
public class StudentController {
    @Autowired
    private Student student1;
    @Autowired
    private Student student2;
    @Autowired
    private Student student3;

    public StudentController() {
        System.out.println("Student controller bean " + this.hashCode());
    }

    @GetMapping("/student1")
    public Integer getStudent1Address() {
        return student1.hashCode();
    }

    @GetMapping("/student2")
    public Integer getStudent2Address() {
        return student2.hashCode();
    }

    @GetMapping("/student3")
    public Integer getStudent3Address() {
        return student3.hashCode();
    }
}
