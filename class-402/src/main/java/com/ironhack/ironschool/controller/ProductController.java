package com.ironhack.ironschool.controller;

import com.ironhack.ironschool.*;
import com.ironhack.ironschool.models.*;
import com.ironhack.ironschool.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;
    @GetMapping("/products/find-all")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAll() {
        return productRepository.findAll();
    }


    @GetMapping("products/department/{department}")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findByDepartment(@PathVariable String department) {
        return productRepository.findByDepartment(Department.valueOf(department.toUpperCase()));

    }

    @GetMapping("products/category/{cat}")
    public List<Product> findByCategory(@PathVariable(name = "cat") Category category) {
        return productRepository.findByCategory(category);
    }

    @GetMapping("products/filter/{category}/{department}")
    public List<Product> findByCatAndDep(@PathVariable String category, @PathVariable String department) {
        return productRepository.findByCategoryAndDepartment(Category.valueOf(category.toUpperCase()), Department.valueOf(department.toUpperCase()));
    }

    @GetMapping("/products")
    @ResponseStatus(HttpStatus.OK)
    List<Product> findByCategoryAndDepartment(@RequestParam Optional<String> category, @RequestParam Optional<String> department) {

        if (category.isPresent() && department.isPresent()){
            return productRepository.findByCategoryAndDepartment(Category.valueOf(category.get().toUpperCase()), Department.valueOf(department.get().toUpperCase()));
        }

        if (category.isPresent()) {
            return productRepository.findByCategory(Category.valueOf(category.get().toUpperCase()));
        }

        if (department.isPresent()) {
            return productRepository.findByDepartment(Department.valueOf(department.get().toUpperCase()));
        }

        return productRepository.findAll();
    }



}
