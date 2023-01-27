package com.ironhack.netflix.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Series extends Media {
    private Integer numberOfSeasons;
    private Integer numberOfEpisodes;

    public Series(String name, Integer yearReleased, Integer numberOfSeasons, Integer numberOfEpisodes) {
        super(name, yearReleased);
        this.numberOfSeasons = numberOfSeasons;
        this.numberOfEpisodes = numberOfEpisodes;
    }
}
