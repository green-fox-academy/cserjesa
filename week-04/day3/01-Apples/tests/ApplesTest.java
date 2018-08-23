import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

    @Test
    public void main() {
        Apples a = new Apples();
        assertEquals("apple",a.getApple());
    }
}