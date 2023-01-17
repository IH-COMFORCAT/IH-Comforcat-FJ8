import org.example.models.Warrior;
import org.example.models.Wizard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterTest {
    Warrior warrior;
    Wizard wizard;

    @BeforeEach
    public void setUp(){
        warrior = new Warrior();
        wizard = new Wizard();

    }

    @Test
    public void decreaseLives_OK(){
        warrior.decreaseLives();
        assertEquals(2 , warrior.getLives());
        assertEquals(100, warrior.getHealth());
    }

    @Test
    public void attack_test(){
        warrior.attack(wizard);
        assertEquals(80, wizard.getHealth());
        assertEquals(2, wizard.getLives());
    }
}
