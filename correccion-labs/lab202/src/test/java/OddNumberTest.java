import org.example.OddNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class OddNumberTest {


    @Test
    public void create_arrray_oddNumbers_OK(){
        int[] result = new int[]{1, 3, 5};

        assertArrayEquals(result, OddNumber.createArray(5));
    }

    @Test
    public void create_array_negative_throwsException(){
        int[] result = new int[0];

        assertArrayEquals(result, OddNumber.createArray(-5));
    }
}
