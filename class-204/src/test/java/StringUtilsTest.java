import org.example.*;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class StringUtilsTest {


    @Test
    public void shouldConcatenate_WhenTwoValidParametersAreGiven() {
        assertEquals("Jaume Sánchez", StringUtils.concatenate("Jaume", "Sánchez"));
    }

    @Test
    public void shouldThrowException_WhenInvalidParametersAreGiven() {
        assertThrows(IllegalArgumentException.class, () -> StringUtils.concatenate("", "Sánchez"));

        assertThrows(IllegalArgumentException.class, () -> StringUtils.concatenate("Jaume", ""));

        assertThrows(IllegalArgumentException.class, () -> StringUtils.concatenate("Jaume", null));

        assertThrows(IllegalArgumentException.class, () -> StringUtils.concatenate(null, "Sánchez"));
    }
}
