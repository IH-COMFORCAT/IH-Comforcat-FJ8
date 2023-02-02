package com.ironhack.lab406;

import com.ironhack.lab406.Repositories.DepartmentRepository;
import com.ironhack.lab406.Repositories.ProductRepository;
import com.ironhack.lab406.models.Department;
import com.ironhack.lab406.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab406Application implements CommandLineRunner {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(Lab406Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Department department1 = departmentRepository.save(new Department("tools"));
		Department department2 = departmentRepository.save(new Department("edible plants"));
		Department department3 = departmentRepository.save(new Department("non-edible plants"));
		Department department4 = departmentRepository.save(new Department("edible seeds"));
		Department department5 = departmentRepository.save(new Department("non-edible seeds"));
		Department department6 = departmentRepository.save(new Department("miscellaneous"));


		Product product1 = productRepository.save(new Product(department1, "small shovel", 50));
		Product product2 = productRepository.save(new Product(department1, "large shovel", 150));
		Product product3 = productRepository.save(new Product(department2, "apple tree sapling", 10));
		Product product4 = productRepository.save(new Product(department4, "assorted root vegetable seed packet", 2000));
		Product product5 = productRepository.save(new Product(department5, "geranium seed packet", 1000));
		Product product6 = productRepository.save(new Product(department2, "sprouted carrots", 200));
		Product product7 = productRepository.save(new Product(department6, "large brim gardening hat", 25));

	}
}
