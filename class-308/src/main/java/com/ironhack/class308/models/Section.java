package com.ironhack.class308.models;

import jakarta.persistence.*;

@Entity
public class Section {
    @Id
    private String id;
    private Integer roomNumber;
    private String teacherName;
    @ManyToOne
    @JoinColumn(name = "course_code")
    private Course course;
}
