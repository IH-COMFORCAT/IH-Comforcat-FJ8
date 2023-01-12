import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BigDecimal a = new BigDecimal("10");
        BigDecimal b = new BigDecimal("5");

        System.out.println(a.compareTo(b) > 0);

        Intern intern = new Intern("55555J", "Pepe", "Pepito", "IT", new BigDecimal("25000"), "20/03/2023");

        boolean isEmployee;
        String[] dnis = {"5555J", "4444X", "3333W", "6666T", "8888W"};
        String[] names = {"Jaume", "Marina", "Néstor", "Jordi", "Miguel", "Anthony", "Diego"};
        String[] surnames = {"Sánchez", "Andreu", "Lloris", "Schumacher"};
        String[] departments = {"Legal", "IT", "Marketing", "HR"};

        FileWriter writer = new FileWriter("employees.txt");


        for (int i = 0; i < 100; i++) {

            Random random = new Random();
            isEmployee = random.nextBoolean();

            if (isEmployee) {
                Employee employee = new Employee(
                        dnis[random.nextInt(dnis.length)],
                        names[random.nextInt(names.length)],
                        surnames[random.nextInt(surnames.length)],
                        departments[random.nextInt(departments.length)],
                        new BigDecimal(random.nextDouble(40000) + 10000).setScale(2, RoundingMode.HALF_UP)
                );
                writer.write(employee.toString() + "\n");

            } else {
                Intern intern1 = new Intern(
                        dnis[random.nextInt(dnis.length)],
                        names[random.nextInt(names.length)],
                        surnames[random.nextInt(surnames.length)],
                        departments[random.nextInt(departments.length)],
                        new BigDecimal(random.nextDouble(40000) + 10000).setScale(2, RoundingMode.HALF_UP), "13/01/2024"
                );
                writer.write(intern1.toString() + "\n");

            }

        }
        writer.close();


/*

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            System.out.println("Número random: " + random.nextInt(5));
            System.out.println("Booleano aleatorio: " + random.nextBoolean());
        }
 */


    }
}
