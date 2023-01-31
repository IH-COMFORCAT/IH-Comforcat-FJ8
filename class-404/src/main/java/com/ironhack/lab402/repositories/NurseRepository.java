package com.ironhack.lab402.repositories;

import com.ironhack.lab402.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface NurseRepository extends JpaRepository<Nurse, Long> {
}
