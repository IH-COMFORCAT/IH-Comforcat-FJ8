package com.ironhack.class308;

import com.ironhack.class308.enums.*;
import com.ironhack.class308.models.*;
import com.ironhack.class308.repositories.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

@SpringBootTest
public class StudentTest {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    HouseAssignmentRepository houseAssignmentRepository;

    HouseAssignment houseAssignment;
    Student student;

    @Test
    void shouldCreateHouseAssignmentAndStudent() {
        houseAssignment = houseAssignmentRepository.save(new HouseAssignment(House.GRIFFINDOR, Wing.WEST, 146));
        student = studentRepository.save(new Student("Jaume", "Potter", houseAssignment));

        Assertions.assertEquals(146, studentRepository.findAll().get(0).getHouseAssignment().getAssignedBed());

    }


}
