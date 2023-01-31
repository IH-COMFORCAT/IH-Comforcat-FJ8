package com.ironhack.lab402;

import com.ironhack.lab402.models.Employee;
import com.ironhack.lab402.models.Patient;
import com.ironhack.lab402.models.Status;
import com.ironhack.lab402.repositories.EmployeeRepository;
import com.ironhack.lab402.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Lab402Application implements CommandLineRunner {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(Lab402Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Employee doctor1 = employeeRepository.save(new Employee(356712, "cardiology", "Alonso Flores", Status.ON_CALL));
		Employee doctor2 = employeeRepository.save(new Employee(564134, "immunology", "Sam Ortega", Status.ON));
		Employee doctor3 = employeeRepository.save(new Employee(761527,"cardiology", "German Ruiz", Status.OFF ));
		Employee doctor4 = employeeRepository.save(new Employee(166552,"pulmonary", "Maria Lin", Status.ON ));
		Employee doctor5 = employeeRepository.save(new Employee(156545,"orthopaedic", "Paolo Rodriguez", Status.ON_CALL ));
		Employee doctor6 = employeeRepository.save(new Employee(172456,"psychiatric", "John Paul Armes", Status.OFF ));

		Patient patient1 = patientRepository.save(new Patient("Jaime Jordan", LocalDate.of(1984,03,02), doctor2));
		Patient patient2 = patientRepository.save(new Patient("Marian Garcia", LocalDate.of(1972,01,12), doctor2));
		Patient patient3 = patientRepository.save(new Patient("Julia Dusterdieck", LocalDate.of(1954,06,11), doctor1));
		Patient patient4 = patientRepository.save(new Patient("Steve McDuck", LocalDate.of(1931,11,10), doctor3));
		Patient patient5 = patientRepository.save(new Patient("Marian Garcia", LocalDate.of(1999,02,15), doctor6));



	}
}
