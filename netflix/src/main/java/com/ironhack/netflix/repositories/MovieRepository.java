package com.ironhack.netflix.repositories;

import com.ironhack.netflix.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
