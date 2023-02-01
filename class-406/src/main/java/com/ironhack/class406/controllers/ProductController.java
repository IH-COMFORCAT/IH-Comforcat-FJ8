package com.ironhack.class406.controllers;

import com.ironhack.class406.models.*;
import com.ironhack.class406.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
public class ProductController implements ProductServiceInt {

    @Autowired
    ProductServiceInt productService;

    @GetMapping("/products/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAllProducts() {
        return productService.findAllProducts();
    }

    @GetMapping("/products/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Product findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @PostMapping("/products")
    @ResponseStatus(HttpStatus.CREATED)
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PutMapping("products/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Product modifyProduct(@PathVariable Long id,@RequestBody Product product) {
        return productService.modifyProduct(id, product);
    }

    @PatchMapping("products/{id}")
    public Product modifyName(@PathVariable Long id, @RequestParam String name) {
        return productService.modifyName(id, name);
    }
}
