import org.example.ForbiddenWords;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ForbiddenWordsTest {

    @Test
    public void finds_forbiddenWord_PASS(){
        assertTrue(ForbiddenWords.findForbiddenWord("I need a break"));
    }

    @Test
    public void finds_forbiddenWord_FAILS(){
        assertFalse(ForbiddenWords.findForbiddenWord("I need to breakdance"));
    }
}
