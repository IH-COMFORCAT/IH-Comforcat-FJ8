package com.ironhack.airport.models;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Warrior extends Character {
    private Integer stamina;
    private Integer strength;

    public Warrior(String name, boolean isAlive, Integer stamina, Integer strength) {
        super(name, isAlive);
        this.stamina = stamina;
        this.strength = strength;
    }

    public Warrior() {
    }

    public Integer getStamina() {
        return stamina;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Warrior warrior = (Warrior) o;
        return Objects.equals(getStamina(), warrior.getStamina()) && Objects.equals(getStrength(), warrior.getStrength());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getStamina(), getStrength());
    }
}
