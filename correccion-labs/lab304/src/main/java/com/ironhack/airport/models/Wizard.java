package com.ironhack.airport.models;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Wizard extends Character {

    private Integer mana;
    private Integer intelligence;

    public Wizard(String name, boolean isAlive, Integer mana, Integer intelligence) {
        super(name, isAlive);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    public Wizard() {
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Wizard wizard = (Wizard) o;
        return Objects.equals(getMana(), wizard.getMana()) && Objects.equals(getIntelligence(), wizard.getIntelligence());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMana(), getIntelligence());
    }
}
