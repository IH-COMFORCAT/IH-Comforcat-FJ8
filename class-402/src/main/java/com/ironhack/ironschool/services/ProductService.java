package com.ironhack.ironschool.services;

import com.ironhack.ironschool.*;
import com.ironhack.ironschool.models.*;
import com.ironhack.ironschool.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public List<Product> findByCategory(String  category) {
        return productRepository.findByCategory(Category.valueOf(category.toUpperCase()));
    }

    public List<Product> findByDepartment(String department) {
        return productRepository.findByDepartment(Department.valueOf(department.toUpperCase()));
    }

    public List<Product> findByCategoryAndDepartment(String category, String department) {
        return productRepository.findByCategoryAndDepartment(Category.valueOf(category.toUpperCase()), Department.valueOf(department.toUpperCase()));
    }

    public List<Product> findByCategoryAndDepartment( Optional<String> category, Optional<String> department) {

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
