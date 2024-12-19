package com.rakshitvahi.HealthAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/healthapi")
@RestController
public class HealthApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthApiApplication.class, args);
	}

	@GetMapping("/health")
	public String health() {
		return String.format("Hello World!");
	}

}
