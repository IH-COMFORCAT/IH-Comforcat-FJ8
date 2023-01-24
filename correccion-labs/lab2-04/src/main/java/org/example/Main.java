package org.example;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona una opción");
        System.out.println("1. Empezar batalla");
        System.out.println("2. Salir");

        boolean inputIsCorrect = false;
        int input = 0;
        while(!inputIsCorrect){

            try{
                input = scanner.nextInt();
            }catch (InputMismatchException e){
                scanner.nextLine();
            }

            switch (input){
                case 1:
                    inputIsCorrect = true;
                    empezarBatalla();
                    break;
                case 2 :
                    inputIsCorrect = true;
                    System.out.println("Programa finalizado");
                default:
                    System.out.println("Escoje un numero entre 1 y 2");
            }
        }


    }


    private static void empezarBatalla(){
        System.out.println("emepzando batalla");
    }
}