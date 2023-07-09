package com.example.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyprojectApplication {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/path")
	String f1() {
		return "f1";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyprojectApplication.class, args);
	}

}
