package org.example;

import java.util.*;

public class Car {

    private String licensePlate;
    private String brand;
    private String model;
    private int cc;

    public Car(String brand, String model, int cc, String licensePlate) {
        this.brand = brand;
        this.model = model;
        setCc(cc);
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {

        if (cc < 0) {
            throw new IllegalArgumentException("Los centimetros cúbicos deben mayor o igual que cero");
        } else {
            this.cc = cc;
        }
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getCc() == car.getCc() && Objects.equals(getBrand(), car.getBrand()) && Objects.equals(getModel(), car.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getCc());
    }
}
