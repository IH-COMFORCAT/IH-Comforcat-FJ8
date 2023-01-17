package org.example;

import com.google.gson.*;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el número que quieres dividir:");
        int a = 0;
        int b = 0;

        boolean inputIsValid = false;

        while (inputIsValid == false) {
            try {
                a = Integer.parseInt(input.nextLine());
                inputIsValid = true;
            } catch (NumberFormatException exception) {
                System.err.println("No se ha podido convertir el input en número, se establece el número 10 por defecto");
                exception.printStackTrace();
                System.out.println("Por favor introduce un número válido");
            }
        }
        System.out.println("Introduce el número por el que quieres dividir el número anterior:");


        inputIsValid = false;

        while (!inputIsValid) {
            try {
                b = Integer.parseInt(input.nextLine());
                inputIsValid = true;
            } catch (NumberFormatException exception) {
                System.err.println("No se ha podido convertir el input en número, se establece el número 10 por defecto");
                System.out.println(exception.getMessage());
                System.out.println("Por favor introduce un número válido");
            }
        }


        //"1234" int i = 1234
        double result = MathLibrary.divide(a, b);
        System.out.println("El resultado de la división es " + result);

        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i < 100; i++) {
            System.out.println(array[i]);
        }

        File file = new File("/alumnos.txt");



        FileWriter writer;

        Scanner input2 = new Scanner(System.in);
        System.out.println("Introduce la ruta donde quieres crear el archivo");
        String path = input2.nextLine();

        try {
            MathLibrary.createFile(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {

        writer = new FileWriter(file);
            System.out.println("Archivo creado con éxito");
        } catch (IOException exception) {
          exception.printStackTrace();
            try {
                writer = new FileWriter("alumnos.txt");
                System.out.println("EL archivo no se ha podido crear en la ruta especificada, se crea en la raiz de la app");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        Car car = new Car("Ford", "Fiesta", 100);


        String coche = "{\"brand\": \"Ford\", \"model\": \"Fiest\", \"cc\": 1000}";

        Gson gson = new Gson();

        Car car2 = gson.fromJson(coche, Car.class);

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, introduce un nombre");

        String name = input.nextLine();

        System.out.println("Introduce un apellido");

        String surname = input.nextLine();

        System.out.println("Tu nombre sin comprobar errores es: " + StringUtils.concatenateWithoutError(name, surname));


        try {
            System.out.println("Tu nombre y apellidos son: " + StringUtils.concatenate(name, null));
        } catch (IllegalArgumentException e) {
            System.out.println("Me has pasado un nombre que no es válido. Se te asignaré el nombre de Rodolfo Langostino");
        }



    }
}
