package org.example;

import com.google.gson.*;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // Creamos un objeto en java y lo convertimos a json
        Driver driver = new Driver("Anthony", 30, new Car("Ford", "Fiesta"));

        Gson gson = new Gson();

        System.out.println(gson.toJson(driver));


        /*
        {
        "name" : "Estel,
        "age": 25,
        "car": {
            "brand": "Audi",
            "model": "Q3"
            }
         }
         */

        String json = "{\"name\":\"Estel\",\"age\":25,\"car\":{\"brand\":\"Audi\",\"model\":\"Q3\"}}";

        Driver driver2 = gson.fromJson(json, Driver.class);

        System.out.println(driver2.getName());

        String data = "\"Hola\"";
        // "Hola"
        System.out.println(data);

        FileWriter writer = new FileWriter("drivers.json");
        writer.write(json);
        writer.close();

        File file = new File("drivers.json");

        Scanner reader = new Scanner(file);

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            Driver newDriver = gson.fromJson(line, Driver.class);
            System.out.println(newDriver.getName());
            System.out.println(newDriver.getAge());

        }





    }
}
