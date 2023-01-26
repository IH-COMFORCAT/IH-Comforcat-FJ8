package com.ironhack.class308.models;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Spell {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Short level;
    @ManyToMany(mappedBy = "spells")
    private List<Student> students;

    public Spell( String name, Short level) {
        this.name = name;
        this.level = level;
    }

    public Spell() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getLevel() {
        return level;
    }

    public void setLevel(Short level) {
        this.level = level;
    }
}
