package com.ironhack.netflix.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    @ManyToOne
    @JoinColumn(name = "plan_id")
    private Plan plan;
    @OneToMany(mappedBy = "account", fetch = FetchType.EAGER)
    private List<User> users = new ArrayList<>();

    public Account(String email, String password, Plan plan) {
        this.email = email;
        this.password = password;
        this.plan = plan;
    }

    public void addMember(User user) {
        this.users.add(user);
    }
}
