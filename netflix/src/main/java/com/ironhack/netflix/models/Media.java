package com.ironhack.netflix.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer yearReleased;
    @ManyToMany(mappedBy = "favoriteMedia")
    private List<User> users;
    public Media(String name, Integer yearReleased) {
        this.name = name;
        this.yearReleased = yearReleased;
    }

}
