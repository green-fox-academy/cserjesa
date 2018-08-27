import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnagramTest {

    @Test
    public void isAnagram1() {

        assertEquals(true, Anagram.isAnagram("kutya", "tyuka"));
    }

    @Test
    public void isAnagram2() {

        assertEquals(false, Anagram.isAnagram("kutya", "cica"));
    }

    @Test
    public void isAnagram3() {

        assertEquals(false, Anagram.isAnagram("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }
}
