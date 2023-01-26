package com.ironhack.class308.models;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Course {
    @Id
    private String courseCode;
    private String courseName;
    @OneToMany(mappedBy = "course")
    List<Section> sections;

}
