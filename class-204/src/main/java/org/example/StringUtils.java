package org.example;

public class StringUtils {


    public static String concatenate(String firstName, String lastName) throws IllegalArgumentException {

        if (firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("No puedo mi trabajo, me has pasado un nombre o apellido inválido");
        }

        return firstName + " " + lastName;
    }

    public static String concatenateWithoutError(String firstName, String lastName) {

        return firstName + " " + lastName;
    }
}
