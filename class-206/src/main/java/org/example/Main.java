package org.example;

import java.io.IOException;
import java.util.*;

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

        Employee newEmployee = new Employee("Manuel", "18/01/1995", Department.MARKETING);
        newEmployee.setContractType(ContractType.REMOTE);
        Employee newEmployee2 = new Employee("Néstor", "18/01/1992", Department.IT);
        Employee newEmployee3 = new Employee("Dani", "17/01/1992", Department.IT);
        Employee newEmployee4 = new Employee("Alexis", "18/01/1994", Department.HR);


        System.out.println("\n\n==== HASHMAPS ===");
        LinkedHashMap<String, Employee> mapOfEmployees = new LinkedHashMap<>();

        mapOfEmployees.put("EMPLOYEE_01", newEmployee);
        mapOfEmployees.put("EMPLOYEE_02", newEmployee2);
        mapOfEmployees.put("INTERN_01", newEmployee3);
        mapOfEmployees.put("EMPLOYEE_01", newEmployee4);
        mapOfEmployees.put("INTERN_02", newEmployee4);

        /*
        ArrayList<String> nombres  = {
          0. Marina
          1. Diego
          2. Elineth
          3. Dani


        Hashmap<String, Employee> empleados = {
            "EMPLOYEE_01 = {
                new Employee(),
             EMPLOYEE_02 = {
                new Employee();

         */

        for (Employee e : mapOfEmployees.values()) {
            System.out.println(e.getName());
        }

        for (String identifier : mapOfEmployees.keySet()) {
            if (identifier.equals("EMPLOYEE_02")) {
                System.out.println("El nombre del empleado 02 es " + mapOfEmployees.get("EMPLOYEE_02").getName());
            }
        }



        LinkedHashMap<Employee, List<Employee>> managersAndEmployees = new LinkedHashMap<>();

        managersAndEmployees.put(newEmployee, List.of(newEmployee2, newEmployee3, newEmployee4));

        List<Employee> manuelEmployees = managersAndEmployees.get(newEmployee);

        System.out.println(Arrays.toString(manuelEmployees.toArray()));



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
