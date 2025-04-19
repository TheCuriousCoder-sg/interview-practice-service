package com.theCuriousCoder.interview_practice_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@ComponentScan(basePackages = "com.theCuriousCoder.interview_practice_service.controller")
@EnableAutoConfiguration(exclude = {DispatcherServletAutoConfiguration.class})
public class InterviewPracticeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPracticeServiceApplication.class, args);
	}

	@Bean
	public Faculty faculty() {
		return new Faculty();
	}

}
