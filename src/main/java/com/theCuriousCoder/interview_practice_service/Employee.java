package com.theCuriousCoder.interview_practice_service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"dev","test"})
public class Employee {
    public Employee(){
        System.out.println("This is employee bean");
    }
}
