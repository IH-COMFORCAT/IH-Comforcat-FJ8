package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
       Person person = new Person(1, "Jaume Sanchez", 34, "Teacher");


        try {
            Person.writePerson(person , "/person.txt");
        } catch (IOException e) {

            System.err.println(e.getMessage());
            System.err.println("No se ha podido crear el archivo");
        }
        System.out.println("Programa finalizado");

    }
}