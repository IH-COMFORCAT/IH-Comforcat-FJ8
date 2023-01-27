package com.ironhack.netflix.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    @OneToMany(mappedBy = "plan")
    private List<Account> accounts;

    public Plan(String name, Double price) {
        this.name = name;
        this.price = price;
    }
}
