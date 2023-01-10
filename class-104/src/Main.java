import java.util.*;

public class Main {
    public static void main(String[] args) {
      

        String[] names = {"Jaume", "Alejandro"};

        for (String name : names) {
            System.out.println(name);
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, introduce tu nombre:");

        String myName = input.nextLine();

        System.out.println("Bienvenido al bootcamp, " + myName);

        System.out.println("Por favor, introduce tu edad:");

        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        System.out.println("Elige qué quieres hacer:");

        System.out.println("1. Sumar");
        System.out.println("2. Restar");

        int selection = input.nextInt();

        if (selection == 1) {
            System.out.println("2 + 2 = 4");
        } else if (selection == 2) {
            System.out.println("2 - 2 = 0");
        } else {
            System.err.println("Comando no válido");
        }

        input.close();

    }
}
