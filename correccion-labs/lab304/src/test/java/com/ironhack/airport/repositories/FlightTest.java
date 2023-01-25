package com.ironhack.airport.repositories;

import com.ironhack.airport.models.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FlightTest {

    @Autowired
    FlightRepository flightRepository;
    Flight flight1;
    Flight flight2;
    Flight flight3;

    @BeforeEach
    void setUp() {
        flight1 = flightRepository.save(new Flight("FL-0153", 1000l, "Airbus A330"));
        flight2 = flightRepository.save(new Flight("FL-2023", 5000l, "Boeing 747"));
        flight3 = flightRepository.save(new Flight("FL-1808", 7500l, "Boeing 787"));

    }

    @AfterEach
    void tearDown() {
        flightRepository.deleteAll();
    }

    @Test
    void shouldCreateFlights_WhenSaveIsCalled() {

        assertEquals(2, flightRepository.findAll().size());
        assertEquals("FL-0153", flightRepository.findById(flight1.getFlightNumber()).get().getFlightNumber());
    }

    @Test
    void shouldFindOneFlight_WhenMileageBetween500and1500() {

        assertEquals(1, flightRepository.findByMileageBetween(500l, 1500l).size());

    }

    @Test
    void shouldFindBoeings_WhenFindByAircraftIsCalled() {
        assertEquals(1, flightRepository.findByAircraftContaining("Boeing").size());
    }

    @Test
    void shouldFilterByNameAndMileage_WhenMethodIsCalled() {

        assertEquals(1, flightRepository.findByAircraftContainingAndMileageBetween("Boeing", 2000l, 6000l).size());

        assertEquals(2, flightRepository.findByAircraftContainingAndMileageBetween("Boeing", 2000l, 8000l).size());
    }
}
