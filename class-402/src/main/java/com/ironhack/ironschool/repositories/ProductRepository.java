package com.ironhack.ironschool.repositories;

import com.ironhack.ironschool.*;
import com.ironhack.ironschool.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByDepartment(Department department);
    List<Product> findByCategory(Category category);
    List<Product> findByCategoryAndDepartment(Category category, Department department);
}
