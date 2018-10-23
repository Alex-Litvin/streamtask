import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Task_3Test {
    private List<String> list;
    private String expected = "1, 2, 0, 4, 5";

    @Before
    public void setUp() throws Exception {
        list = Arrays.asList("1, 2, 0", "4, 5");
    }

    @Test
    public void resultStringShouldBeEqualsExpected() {
        assertEquals(expected, Task_3.convert(list));
    }

    @After
    public void tearDown() throws Exception {
        list = null;
        expected = null;
    }
}