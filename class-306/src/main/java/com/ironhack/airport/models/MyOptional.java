package com.ironhack.airport.models;

public class MyOptional{

    String savedData;
    boolean isPresent;

    public MyOptional(String savedData) {
        this.savedData = savedData;
    }

    public String get() {
        return savedData;
    }

    public void setSavedData(String savedData) {
        this.savedData = savedData;
    }

    public boolean isPresent() {
        return !(savedData == null);
    }


}
