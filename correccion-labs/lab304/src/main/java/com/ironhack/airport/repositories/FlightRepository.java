package com.ironhack.airport.repositories;

import com.ironhack.airport.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface FlightRepository extends JpaRepository<Flight, String> {
    List<Flight> findByMileageBetween(Long min, Long max);
    List<Flight> findByAircraftContaining(String name);

    List<Flight> findByAircraftContainingAndMileageBetween(String name, Long min, Long max);
}
