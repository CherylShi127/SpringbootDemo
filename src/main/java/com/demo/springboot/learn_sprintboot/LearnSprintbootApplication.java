package com.demo.springboot.learn_sprintboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LearnSprintbootApplication {
	@RequestMapping("/")
	public String home(){
		return "Dockerizing Spring Boot Application test3";
	}

	public static void main(String[] args) {
		SpringApplication.run(LearnSprintbootApplication.class, args);
	}

}
