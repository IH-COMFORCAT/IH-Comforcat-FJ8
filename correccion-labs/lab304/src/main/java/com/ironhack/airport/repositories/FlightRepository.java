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

    // select aircraft, AVG(mileage) from flight group by aircraft;
    @Query("SELECT aircraft, avg(mileage) from Flight group by aircraft")
    List<Object[]> findAverageByAircraft();

    @Query("SELECT aircraft, max(mileage) from Flight group by aircraft")
    List<Object[]> findMaxByAircraft();

    /*
    Search on google binding parameters jpql
    @Query "SELECT aircraft, avg(mileage) from Flight where aircraft = ¿? group by aircraft" -> aircraft
    something findAverageByAircraft(String aircraft)
     */




}
