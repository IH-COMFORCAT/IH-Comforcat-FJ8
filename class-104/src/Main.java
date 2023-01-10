import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

/*

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
        input.nextLine();

        if (age >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        System.out.println("Elige qué quieres hacer:");

        System.out.println("1. Sumar");
        System.out.println("2. Restar");

        int selection = Integer.parseInt(input.nextLine());

        if (selection == 1) {
            System.out.println("2 + 2 = 4");
        } else if (selection == 2) {
            System.out.println("2 - 2 = 0");
        } else {
            System.err.println("Comando no válido");
        }

        System.out.println("Introduce la frase");

        String phrase = input.nextLine();
        input.close();

        int totalwords = startsWithVowel(phrase);

 */

        FileWriter writer = new FileWriter("/Users/jasato/Desktop/IH-Java-11.nosync/demo.txt", true);
        writer.write("Hola clase \n");
        writer.close();

        File archivo = new File("/Users/jasato/Desktop/IH-Java-11.nosync/demo.txt");

        Scanner fileReader = new Scanner(archivo);

        while (fileReader.hasNextLine()) {
            System.out.println(fileReader.nextLine());
        }


        fileReader.close();

        File oscarsFile = new File("src/oscar_age_female.csv");
        Scanner oscarsReader = new Scanner(oscarsFile);
        FileWriter writer1 = new FileWriter("result.txt", false);

       String firstLine= oscarsReader.nextLine();

        System.out.println("Primera linea: " + firstLine + " no nos interesa");

        while (oscarsReader.hasNextLine()) {
            String[] line = oscarsReader.nextLine().split(", ");

            writer1.write("Año: " + line[1] + "\n");
            writer1.write("Name: " + line[3] + "\n");
            writer1.write("Age: " + line[2] + "\n");
            writer1.write("Movie: " + line[4] + "\n");
            writer1.write("========" + "\n");


        }

        writer1.close();


    }

    public static int startsWithVowel(String phrase) {
        String[] words = phrase.toLowerCase().split(" ");

        int counter = 0;
        for (String word : words) {
            // char c = word.charAt(0);
            if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")) {
                counter++;
            } else {
                System.err.println("La palabra " + word + " no empieza por vocal");
            }
        }

        System.out.println("Número total de palabras que empiezan por vocal: " + counter);
        return counter;

    }
}
