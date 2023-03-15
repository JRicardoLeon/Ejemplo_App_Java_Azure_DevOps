import com.microsoft.demo.Demo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        boolean r = d.DoSomething(true);

        assertTrue(r);
    }

    @Test
    public void test_method_2() {
        Demo b = new Demo();
        boolean r = b.DoSomething(false);

        assertFalse(r);
    }
}