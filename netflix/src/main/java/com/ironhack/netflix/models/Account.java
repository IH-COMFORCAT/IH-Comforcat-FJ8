package com.ironhack.netflix.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

import static jakarta.persistence.FetchType.EAGER;

@Entity
@Getter
@Setter
@Data
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

    @ManyToMany(fetch = EAGER)
    private Collection<Role> roles = new ArrayList<>();

    public Account(String email, String password, Plan plan) {
        this.email = email;
        this.password = password;
        this.plan = plan;
    }

    public void addMember(User user) {
        this.users.add(user);
    }
}

