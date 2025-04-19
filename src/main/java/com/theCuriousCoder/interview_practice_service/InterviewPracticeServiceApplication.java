package com.theCuriousCoder.interview_practice_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@SpringBootApplication
public class InterviewPracticeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPracticeServiceApplication.class, args);
	}

	@Bean("JsonViewTemplate")
	public View name() {
		return new MappingJackson2JsonView();
	}

}
