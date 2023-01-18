package org.example;

import java.util.ArrayList;
import java.util.List;

public class PersonList {

    private List<Person> personList;

    public PersonList() {
        this.personList = new ArrayList<>();
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void setPersonList(Person person){
        this.personList.add(person);
    }

    public Person findByName(String name){
        if(name.split(" ").length != 2) throw new IllegalArgumentException("El nombre tiene un formato incorrecto");
        for(Person p : personList){
            if(p.getName().equals(name)) return p;
        }
        throw new IndexOutOfBoundsException("La persona no está en la lista");
    }
}
