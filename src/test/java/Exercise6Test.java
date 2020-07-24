import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise6Test {

    @Test
    public void test() {
        System.out.println("longest Fixed Tests");
        assertEquals("aehrsty", Exercise6.longest("aretheyhere", "yestheyarehere"));
        assertEquals("abcdefghilnoprstu", Exercise6.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        assertEquals("acefghilmnoprstuy", Exercise6.longest("inmanylanguages", "theresapairoffunctions"));
    }

}