import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise7Test {
    private Exercise7 checker = new Exercise7();

    @Test
    public void testValid() {
        assertEquals(true, checker.isValid("()"));
    }

    @Test
    public void testInvalid() {
        assertEquals(false, checker.isValid("[(])}"));
    }



}