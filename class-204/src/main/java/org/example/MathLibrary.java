package org.example;

import java.io.*;

public class MathLibrary {

    public static double divide(int num1, int num2) {

        if (num1 == 0 && num2 == 0) {
            throw new IllegalArgumentException("Los números a dividir no pueden ser 0");
        }

        return (double) num1 / (double) num2;
    }

    public static void createFile(String path) throws IOException {
        FileWriter writer = new FileWriter(path);
        System.out.println("Arhivo creado");
    }
}
