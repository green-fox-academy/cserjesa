import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberConverterTest {

    @Test
    public void convertNumber1() {
        assertEquals(" fifty", NumberConverter.numberConverter(50));
    }

    @Test
    public void convertNumber2() {
        assertEquals(" twenty", NumberConverter.numberConverter(20));
    }

    @Test
    public void convertNumber3() {
        assertEquals(" one hundred", NumberConverter.numberConverter(100));
    }

    @Test
    public void convertNumber4() {
        assertEquals(5, NumberConverter.stringConverter("five"));
    }

    @Test
    public void convertNumber5() {
        assertEquals(3000000, NumberConverter.stringConverter("three million"));
    }
}
