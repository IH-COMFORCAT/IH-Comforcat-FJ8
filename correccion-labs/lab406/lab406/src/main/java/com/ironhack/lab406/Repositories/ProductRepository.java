package com.ironhack.lab406.Repositories;

import com.ironhack.lab406.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);

    List<Product> findByDepartmentDepartment(String department);
}
