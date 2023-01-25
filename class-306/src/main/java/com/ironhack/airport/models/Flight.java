package com.ironhack.airport.models;

import jakarta.persistence.*;

import java.util.*;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getFlightNumber(), flight.getFlightNumber()) && Objects.equals(getMileage(), flight.getMileage()) && Objects.equals(getAircraft(), flight.getAircraft());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlightNumber(), getMileage(), getAircraft());
    }
}
