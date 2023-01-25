package com.ironhack.airport.repositories;

import com.ironhack.airport.enums.*;
import com.ironhack.airport.models.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CustomerTest {

    @Autowired
    CustomerRepository customerRepository;

    Customer customer;
    Customer customer2;

    @BeforeEach
    void setUp() {
        customer = customerRepository.save(new Customer("Jaume Sánchez", Status.GOLD ));
        customer2 = customerRepository.save(new Customer("Alexis Frantz", Status.SILVER));

    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    void shouldFindByName_whenNameIsGiven() {

        assertTrue(customerRepository.findByName("Jaume Sánchez").isPresent());
        assertFalse(customerRepository.findByName("Pepe pepito").isPresent());

        Customer customerFromDatabase;


        /*
        if (customerRepository.findByName("Jaume Sánchez").isPresent()) {
            customerFromDatabase = customerRepository.findByName("Jaume Sánchez").get();
        } else {
            throw new IllegalArgumentException();

        }


        assertEquals("Jaume Sánchez", customerRepository.findByName("Dani ").getName());

         */
    }
}
