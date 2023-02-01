package com.ironhack.class406.repositories;

import com.ironhack.class406.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
