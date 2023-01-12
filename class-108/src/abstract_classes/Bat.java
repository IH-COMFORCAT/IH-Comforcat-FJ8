package abstract_classes;

import exercise.*;

import java.time.*;

public class Bat extends Mammal implements CanFly {

    private double height;
    
    public Bat(LocalDate dateOfBirth, String name, double height) {
        super(dateOfBirth, name);
        this.height = height;
    }

    @Override
    public void fly(double meters) {

    }
}
