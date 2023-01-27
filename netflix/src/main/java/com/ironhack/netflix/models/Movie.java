package com.ironhack.netflix.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Movie extends Media {
    private Integer duration;

    public Movie(String name, Integer yearReleased, Integer duration) {
        super(name, yearReleased);
        this.duration = duration;
    }

}
