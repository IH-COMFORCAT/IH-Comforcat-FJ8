package com.ironhack.airport.repositories;

import com.ironhack.airport.models.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    void shouldFindFlight3_whenFindById() {

        assertTrue(flight3.equals(flightRepository.findById("FL-1808").get()));

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

    @Test
    void shouldFindAverageByAircraft_WhenMethodCalled() {
        flightRepository.deleteAll();
        flightRepository.saveAll(List.of(
                new Flight("FL-105",  5000l, "Boeing 737"),
                new Flight("FL-106",  4000l, "Boeing 747"),
                new Flight("FL-107",  2000l, "Boeing 737"),
                new Flight("FL-108",  1000l, "Boeing 747"),
                new Flight("FL-109",  8000l, "Boeing 747"),
                new Flight("FL-110",  6000l, "Boeing 737")
        ));

        assertEquals("Boeing 737", flightRepository.findAverageByAircraft().get(0)[0]);
        assertEquals("Boeing 747", flightRepository.findAverageByAircraft().get(1)[0]);
        assertEquals(4333.3333, flightRepository.findAverageByAircraft().get(0)[1]);


        flightRepository.deleteAll();
    }

    /*
    ("FL-105", "Boeing 737", 5000),
    ("FL-106", "Boeing 747", 4000),
    ("FL-107", "Boeing 737", 2000),
    ("FL-108", "Boeing 747", 8000),
    ("FL-109", "Boeing 737", 1000),
    ("FL-110", "Boeing 727", 3000);
    milista = [
    [Boeing 737, 3800],
    [Boeing 747, 6000],
    [Boeing 727, 3000]
    ]

    milista.get(0) -> [Boeing 737, 3800]
    milista.get(0)[0] -> Boeing 737
    milista.get(0)[1] -> 3800

     */


}
