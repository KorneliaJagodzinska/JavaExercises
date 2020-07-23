import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise4Test {

    @Test
    void maskifyTest() {

            assertEquals("############5616", Exercise4.maskify("4556364607935616"));
            assertEquals("#######5616",      Exercise4.maskify(     "64607935616"));
            assertEquals("1",                Exercise4.maskify(               "1"));
            assertEquals("",                 Exercise4.maskify(                ""));

    }
}