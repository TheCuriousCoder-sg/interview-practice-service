package com.theCuriousCoder.interview_practice_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name="employee")
@Data
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id ;

    @Column(name = "name")
    private String name;

    @Column(name = "department")
    private String dept ;
}

