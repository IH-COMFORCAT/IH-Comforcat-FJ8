package com.ironhack.class406.services;

import com.ironhack.class406.models.*;

import java.util.*;

public interface ProductServiceInt {
    List<Product> findAllProducts();
    Product findById(Long id);
    Product addProduct(Product product);
    Product modifyProduct(Long id, Product product);
    Product modifyName(Long id, String name);
}
