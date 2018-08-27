import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PotterTest {


    @Test
    public void test1() {
        assertEquals(8, Potter.basketPrice(1), 0);
    }

    @Test
    public void test2() {
        assertEquals(15.2, Potter.basketPrice(2), 0);
    }

    @Test
    public void test3() {
        assertEquals(21.6, Potter.basketPrice(3), 0);
    }

    @Test
    public void test4() {
        assertEquals(25.6, Potter.basketPrice(4), 0);
    }

    @Test
    public void test5() {
        assertEquals(30, Potter.basketPrice(5), 0);
    }

    @Test
    public void test6() {
        assertEquals(30, Potter.basketPrice(1,0,0,0,0), 0);
    }
}
