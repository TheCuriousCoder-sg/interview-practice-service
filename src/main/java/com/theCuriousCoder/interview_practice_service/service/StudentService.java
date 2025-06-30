package com.theCuriousCoder.interview_practice_service.service;

import com.theCuriousCoder.interview_practice_service.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class StudentService {
    @Autowired
    private Student student;

    public Student getStudent() {
        return student;
    }
}
