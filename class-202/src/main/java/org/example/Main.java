package org.example;

import com.google.gson.*;

public class Main {
    public static void main(String[] args) {

        Driver driver = new Driver("Anthony", 30, new Car("Ford", "Fiesta"));

        Gson gson = new Gson();

        System.out.println(gson.toJson(driver));

        String json = "{\"name\":\"Anthony\",\"age\":30,\"car\":{\"brand\":\"Ford\",\"model\":\"Fiesta\"}}";

        Driver driver2 = gson.fromJson(json, Driver.class);

        System.out.println(driver2.getName());

        String data = "\"Hola\"";
        // "Hola"
        System.out.println(data);




    }
}
