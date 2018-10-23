import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Task_2Test {
    private List<String> names;
    private List<String> expected;

    @Before
    public void setUp() throws Exception {
        names = Arrays.asList("Alex", "John", "Oleg", "Peter", "Denny");
        expected = Arrays.asList("PETER", "OLEG", "JOHN", "DENNY", "ALEX");
    }

    @Test
    public void resultListShouldBeEqualsExpected() {
        assertEquals(expected, Task_2.getReverseOrderedUpperCaseNames(names));
    }

    @Test
    public void resultListSizeShouldBeEqualsExpectedSize() {
        assertEquals(5, Task_2.getReverseOrderedUpperCaseNames(names).size());
    }

    @After
    public void tearDown() throws Exception {
        names = null;
        expected = null;
    }
}