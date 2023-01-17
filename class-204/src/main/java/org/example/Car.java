package org.example;

public class Car {

    private String brand;
    private String model;
    private int cc;

    public Car(String brand, String model, int cc) {
        this.brand = brand;
        this.model = model;
        setCc(cc);
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
}
