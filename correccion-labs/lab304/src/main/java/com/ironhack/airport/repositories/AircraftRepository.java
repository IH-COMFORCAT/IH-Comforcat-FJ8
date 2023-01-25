package com.ironhack.airport.repositories;

import com.ironhack.airport.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface AircraftRepository extends JpaRepository<Aircraft, String> {
}
