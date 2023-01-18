import org.example.Person;
import org.example.PersonList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    // Test de Person

    Person person1;
    Person person2;
    PersonList personList1;

    @BeforeEach
    public void setUp(){
        person1 = new Person(1, "Jaume Sanchez", 34, "Teacher");
        person2 = new Person(2, "Jose Caro", 22, "Teacher");
        personList1 = new PersonList();
        personList1.getPersonList().add(person1);
        personList1.getPersonList().add(person2);

        //personList1.getPersonList().addAll(List.of(person1, person2));
    }

    @Test
    public void age_below_0_exception(){
        assertThrows(IllegalArgumentException.class, () -> new Person(1, "Jaume", -34, "Teacher"));
    }

    @Test
    public void create_OK(){
        assertEquals("Jaume", person1.getName());
    }

    @Test
    public void check_age(){
        Person person2 = new Person(2, "Jose", 22, "Teacher");
        assertTrue(person2.getAge() > 0);
    }


    // test de PersonList

    @Test
    public void find_person_Icorrect_name(){
        assertThrows(IllegalArgumentException.class, ()-> personList1.findByName("Jaume"));
    }

    @Test
    public void find_person_name_notFound(){
        assertThrows(IndexOutOfBoundsException.class, ()-> personList1.findByName("Jaume Caro"));
    }

    @Test
    public void find_person_OK(){
        assertEquals(person2.getName(), personList1.findByName("Jose Caro").getName());
    }

    @Test
    public void write_person_FAIL_nullPointer() throws IOException {
        assertThrows(NullPointerException.class, () -> Person.writePerson(null, "person.txt"));
    }

    @Test
    public void write_person_FAIL_IOexception(){
        assertThrows(IOException.class, ()-> Person.writePerson(person1, "/person.txt"));
    }


    @Test
    public void write_person_OK() throws IOException {
        Person.writePerson(person1, "person.txt");
        File file = new File("person.txt");
        Scanner scanner = new Scanner(file);
        assertEquals(person1.toString(), scanner.nextLine());
        scanner.close();
    }



}
