package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
       Person person = new Person(1, "Jaume Sanchez", 34, "Teacher");
       Person person2 = new Person(1, "Jaume Sanchez", 34, "Teacher");

        System.out.println(person.equals(person2));
        System.out.println(person.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person.hashCode() == person2.hashCode());

        System.out.println(System.identityHashCode(person));
        System.out.println(System.identityHashCode(person2));
/*

        try {
            Person.writePerson(person , "/person.txt");
        } catch (IOException e) {

            System.err.println(e.getMessage());
            System.err.println("No se ha podido crear el archivo");
        }
        System.out.println("Programa finalizado");
 */

    }
}
