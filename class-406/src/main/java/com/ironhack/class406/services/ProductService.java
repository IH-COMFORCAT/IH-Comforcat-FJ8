package com.ironhack.class406.services;

import com.ironhack.class406.models.*;
import com.ironhack.class406.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.server.*;

import java.util.*;

@Service
public class ProductService implements ProductServiceInt {

    @Autowired
    ProductRepository productRepository;

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }


    public Product findById(Long id) {
        Optional<Product> product = productRepository.findById(id);

        if (product.isPresent()) {
            return product.get();
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The product you are looking for doesn't exist in the database");
    }


    public Product addProduct(Product product) {
        return productRepository.save(product);
    }


    public Product modifyProduct(Long id, Product product) {
        productRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "The product you are looking for doesn't exist in the database"));
        product.setId(id);
        return productRepository.save(product);
    }


    public Product modifyName(Long id, String name) {
        return null;
    }
}
