package org.example;

public class Driver {

    /*
    {
  "name": "John",
  "age": 30,
  "car": {
        "brand": "Ford",
        "model": "Fiesta"
        }
}
     */
    private String name;
    private int age;
    private Car car;

    public Driver(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}
