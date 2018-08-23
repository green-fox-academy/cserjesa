import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class Anagram2Test {

    @Test
    public void test1() {
        assertTrue(Anagram2.anagram("AB", "BA"));
    }

    @Test
    public void test2() {
        assertTrue(Anagram2.anagram("anagram", "gramana"));
    }

    @Test
    public void test3() {
        assertTrue(Anagram2.anagram("GOD", "dog"));
    }
}