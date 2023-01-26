package com.ironhack.class308;

import com.ironhack.class308.models.*;
import com.ironhack.class308.repositories.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CourseTest {

    @Autowired
    CourseRepository courseRepository;
    @Autowired
    SectionRepository sectionRepository;

    @Test
    void shouldStoreCoursesAndAssignments() {

        Course course = courseRepository.save(new Course("JAVA-01", "Intro to Java"));

        List<Section> sections = sectionRepository.saveAll(
                List.of(
                        new Section("01-JA", 110, "Alejandro", course),
                        new Section("02-Jb", 110, "Jose", course),
                        new Section("03-ZF", 110, "Jaume", course)
                )
        );

        course.setSections(sections);
        courseRepository.save(course);

        Section section = sectionRepository.findAll().get(0);

        assertEquals("Intro to Java", section.getCourse().getCourseName());

        Course courseFromDb = courseRepository.findAll().get(0);

        assertEquals("Alejandro", courseFromDb.getSections().get(0).getTeacherName());


    }
}
