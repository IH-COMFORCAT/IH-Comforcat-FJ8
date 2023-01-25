package com.ironhack.airport.models;

import jakarta.persistence.*;

@Entity
public class Flight {
    @Id
    private String flightNumber;
    private Long mileage;
    private String aircraft;

    public Flight() {
    }

    public Flight(String flightNumber, Long mileage, String aircraft) {
        this.flightNumber = flightNumber;
        this.mileage = mileage;
        this.aircraft = aircraft;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Long getMileage() {
        return mileage;
    }

    public void setMileage(Long mileage) {
        this.mileage = mileage;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }
}
