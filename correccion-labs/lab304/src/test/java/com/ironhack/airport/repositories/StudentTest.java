package com.ironhack.airport.repositories;

import com.ironhack.airport.embeddables.*;
import com.ironhack.airport.models.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

@SpringBootTest
public class StudentTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void shouldCreateStudent() {
        Student student = new Student("Jaume", new Address("Calle Whatever", 46900, "Torrent", "Spain"), new Address("La otra Calle", 46902, "Torrent", "Spain"));
        studentRepository.save(student);
    }
}
