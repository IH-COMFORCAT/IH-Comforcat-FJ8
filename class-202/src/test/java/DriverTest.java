import org.example.*;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DriverTest {

    Driver driver;

    List<Driver> drivers = new ArrayList<>();

    @BeforeEach
    void setUp() {
        driver = new Driver("Néstor", 22, new Car("Fiat", "500"));
        drivers.add(driver);
        System.out.println("This is running before the test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("This is running after the test");

    }

    // Néstor : 0
    // Néstor - > Jose : 0
    // Jose



    @Test
    @DisplayName("When using the name setter, name changes")
    void nameShouldChange_WhenUsingSetter()  {
        System.out.println("This is a test");

        driver.setName("Alejandro");
        assertEquals("Alejandro", driver.getName());

    }

    @Test
    @DisplayName("When calling ShowDriverInfo it shows the correct information")
    void ShouldShowCorrectDriverInfo_whenMethodCalled()  {


        String result = "Driver's name: Néstor Drivers' age: 22";

        assertEquals(result, driver.showDriverInfo());
    }



}
