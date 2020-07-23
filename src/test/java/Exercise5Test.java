import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise5Test {
    @Test
    public void test1() {
        assertEquals("1,57", Exercise5.seriesSum(5));
    }
    @Test
    public void test2() {
        assertEquals("1,77", Exercise5.seriesSum(9));
    }
    @Test
    public void test3() {
        assertEquals("1,94", Exercise5.seriesSum(15));
    }

}