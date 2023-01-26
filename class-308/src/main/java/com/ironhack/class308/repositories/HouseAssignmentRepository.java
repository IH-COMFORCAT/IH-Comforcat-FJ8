package com.ironhack.class308.repositories;

import com.ironhack.class308.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface HouseAssignmentRepository extends JpaRepository<HouseAssignment, Long> {
}
