package com.ironhack.ironschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IronschoolApplication {

	public static void main(String[] args) {

		System.setProperty("spring.devtools.restart.enabled", "true");
		SpringApplication.run(IronschoolApplication.class, args);
	}

}
