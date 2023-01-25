package com.ironhack.airport.models;

import jakarta.persistence.*;
//jpa buddy para que te salten errores relacionados con JPA
@Entity
public class Aircraft {
    @Id
    private String model;
    private Integer seats;

    public Aircraft() {
    }

    public Aircraft(String model, Integer seats) {
        this.model = model;
        this.seats = seats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }
}
