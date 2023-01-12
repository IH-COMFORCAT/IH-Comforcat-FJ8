package abstract_classes;

import java.time.*;

public class Amphibian extends Animal{


    public Amphibian(LocalDate dateOfBirth, String name) {
        super(dateOfBirth, name);
    }

    @Override
    public void eat() {

    }
}
