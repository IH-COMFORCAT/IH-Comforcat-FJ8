package org.example;

import com.google.gson.*;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {



        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(i);
            System.out.println("Añadido el número: " + i);

        }

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


        File invoices = new File("invoices.json");
        Scanner invoicesReader = new Scanner(invoices);
        List<Invoice> invoicesJavaObjects = new ArrayList<>();

        while (invoicesReader.hasNextLine()) {
            Invoice invoice = gson.fromJson(invoicesReader.nextLine(),Invoice.class);
            invoicesJavaObjects.add(invoice);
        }

        System.out.println(invoicesJavaObjects.get(0).getInvoiceItems().get(0).getName());

        System.out.println(MathLibrary.sum(2, 4));


    }
}
