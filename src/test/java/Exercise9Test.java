import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise9Test {

    @Test
    public void test01() {
        assertEquals("TTTT", Exercise9.makeComplement("AAAA"));
    }
    @Test
    public void test02() {
        assertEquals("TAACG", Exercise9.makeComplement("ATTGC"));
    }
    @Test
    public void test03() {
        assertEquals("CATA", Exercise9.makeComplement("GTAT"));
    }

}