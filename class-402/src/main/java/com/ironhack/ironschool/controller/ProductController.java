package com.ironhack.ironschool.controller;

import com.ironhack.ironschool.*;
import com.ironhack.ironschool.models.*;
import com.ironhack.ironschool.repositories.*;
import com.ironhack.ironschool.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products/find-all")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAll() {
        return productService.findAll();
    }


    @GetMapping("products/department/{department}")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findByDepartment(@PathVariable String department) {
        return productService.findByDepartment(department);

    }

    @GetMapping("products/category/{cat}")
    public List<Product> findByCategory(@PathVariable(name = "cat") String category) {
        return productService.findByCategory(category);
    }

    @GetMapping("products/filter/{category}/{department}")
    public List<Product> findByCatAndDep(@PathVariable String category, @PathVariable String department) {
        return productService.findByCategoryAndDepartment(category, department);
    }

    @GetMapping("/products")
    @ResponseStatus(HttpStatus.OK)
    List<Product> findByCategoryAndDepartment(@RequestParam Optional<String> category, @RequestParam Optional<String> department) {
        return productService.findByCategoryAndDepartment(category, department);
    }



}
