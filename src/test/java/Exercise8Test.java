import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise8Test {

    @Test
    public void FixedTests() {
        assertEquals(true, Exercise8.isIsogram("Dermatoglyphics"));
        assertEquals(true, Exercise8.isIsogram("isogram"));
        assertEquals(false, Exercise8.isIsogram("moose"));
        assertEquals(false, Exercise8.isIsogram("isIsogram"));
        assertEquals(false, Exercise8.isIsogram("aba"));
        assertEquals(false, Exercise8.isIsogram("moOse"));
        assertEquals(true, Exercise8.isIsogram("thumbscrewjapingly"));
        assertEquals(true, Exercise8.isIsogram(""));
    }

}