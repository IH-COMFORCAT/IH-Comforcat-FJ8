package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Person {

    private int id;
    private String name;
    private int age;
    private String occupation;

    public Person(int id, String name, int age, String occupation) {
        this.id = id;
        setName(name);
        setAge(age);
        this.occupation = occupation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.split(" ").length != 2)
            throw new IllegalArgumentException("El nombre tiene que tener nombre y apellido");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("La edad tiene que ser positiva");
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public static void writePerson(Person person, String path) throws IOException {
        FileWriter write = new FileWriter(path, false);

        write.write(person.toString());
        write.close();

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && getName().equals(person.getName()) && getOccupation().equals(person.getOccupation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getOccupation());
    }
}
