package abstract_classes;

import java.time.*;

public class Mammal extends Animal{

    private boolean hasFur;
    private int monthsOfBreeding;


    public Mammal(LocalDate dateOfBirth, String name) {
        super(dateOfBirth, name);
    }

    @Override
    public void eat() {

    }
}
