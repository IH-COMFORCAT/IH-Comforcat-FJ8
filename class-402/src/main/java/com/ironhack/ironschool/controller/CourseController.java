package com.ironhack.ironschool.controller;

import com.ironhack.ironschool.models.*;
import com.ironhack.ironschool.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping("/courses")
    @ResponseStatus(HttpStatus.OK)
    public List<Course> findAllCourses() {
            return courseRepository.findAll();

    }

    @GetMapping("/say-hi")
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public String hi() {
        return "Hi, from your Teapot";
    }
}
