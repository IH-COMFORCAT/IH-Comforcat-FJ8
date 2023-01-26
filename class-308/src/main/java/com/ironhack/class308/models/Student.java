package com.ironhack.class308.models;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @OneToOne
    @JoinColumn(name = "house_assignment_id")
    private HouseAssignment houseAssignment;
    @ManyToMany
            @JoinTable(
                    name = "student_spells",
                    joinColumns = @JoinColumn(name = "student_id"),
                    inverseJoinColumns = @JoinColumn(name = "spell_id")
            )
    List<Spell> spells = new ArrayList<>();

    public Student(String firstName, String lastName, HouseAssignment houseAssignment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.houseAssignment = houseAssignment;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public HouseAssignment getHouseAssignment() {
        return houseAssignment;
    }

    public void setHouseAssignment(HouseAssignment houseAssignment) {
        this.houseAssignment = houseAssignment;
    }
}
