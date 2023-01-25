package com.ironhack.airport;

import com.ironhack.airport.models.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirportApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirportApplication.class, args);

		MyOptional myOptional = new MyOptional("Hola");
		MyOptional myOptional2 = new MyOptional(null);

		System.out.println(myOptional2.isPresent());
		System.out.println(myOptional.isPresent());

		if (myOptional.isPresent()) {
			System.out.println(myOptional.get());
		}

	}

}
