package com.ironhack.class308.models;

import com.ironhack.class308.enums.*;
import jakarta.persistence.*;

@Entity
public class HouseAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private House house;
    @Enumerated(EnumType.STRING)
    private Wing wing;
    private Integer assignedBed;
        @OneToOne(mappedBy = "houseAssignment")
        private Student student;

    public HouseAssignment() {
    }

    public HouseAssignment(House house, Wing wing, Integer assignedBed, Student student) {
        this.house = house;
        this.wing = wing;
        this.assignedBed = assignedBed;
        this.student = student;
    }

    public HouseAssignment(House house, Wing wing, Integer assignedBed) {
        this.house = house;
        this.wing = wing;
        this.assignedBed = assignedBed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Wing getWing() {
        return wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

    public Integer getAssignedBed() {
        return assignedBed;
    }

    public void setAssignedBed(Integer assignedBed) {
        this.assignedBed = assignedBed;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
