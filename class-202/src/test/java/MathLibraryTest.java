import org.example.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathLibraryTest {




    @Test
    public void shouldSum_twoPositiveNumbers() {

        assertEquals(6, MathLibrary.sum(2, 4));
        assertEquals(50, MathLibrary.sum(25, 25));
    }

    @Test
    public void shouldShortArray_whenArrayIsGiven() {
        int[] test = {7, 4, 2, 1, -1, 5};
        int[] expectedResult = {-1, 1, 2, 4, 5, 7};
        assertArrayEquals(expectedResult, MathLibrary.sortArray(test));
    }
}
