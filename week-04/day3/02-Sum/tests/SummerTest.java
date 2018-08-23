import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SummerTest {

    ArrayList<Integer> testList3;

    @Before
    public void before() {
        testList3 = new ArrayList<>(Arrays.asList(1, 2, 3));
    }

    @Test
    public void test1() {
        Summer newSum = new Summer();
        assertEquals(6, newSum.sum(testList3));
    }

    @Test
    public void test2() {
        ArrayList<Integer> testList2 = new ArrayList<>(Arrays.asList(1));
        Summer newSum2 = new Summer();
        assertEquals(1, newSum2.sum(testList2));
    }

    @Test
    public void test3() {
        ArrayList<Integer> testList2 = new ArrayList<>(Arrays.asList());
        Summer newSum2 = new Summer();
        assertEquals(0, newSum2.sum(testList2));
    }
    @Test
    public void test4() {
        ArrayList<Integer> testList2 = new ArrayList<>(Arrays.asList(null));
        Summer newSum2 = new Summer();
        assertEquals(1, newSum2.sum(testList2));
    }

}