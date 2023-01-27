package com.ironhack.netflix.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String profilePicture;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
    @ManyToMany(fetch = FetchType.EAGER)
            @JoinTable(
                    name = "users_media",
                    joinColumns = @JoinColumn(name = "user_id"),
                    inverseJoinColumns = @JoinColumn(name = "media_id")
            )
    List<Media> favoriteMedia = new ArrayList<>();

    public User(String name, String profilePicture, Account account) {
        this.name = name;
        this.profilePicture = profilePicture;
        this.account = account;
    }

    public void addToFavorites(Media media) {
        this.favoriteMedia.add(media);
    }
}
