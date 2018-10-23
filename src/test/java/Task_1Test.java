import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Task_1Test {
    private List<String> names;
    private String expected;

    @Before
    public void setUp() throws Exception {
        names = Arrays.asList("Alex", "John", "Oleg", "Peter", "Denny");
        expected = "1. John, 3. Peter";
    }

    @Test
    public void resultStringShouldContainsOnlyNamesWithOddIndices() {
        String result = Task_1.getNamesWithOddIndices(names);
        assertEquals(expected, result);
    }

    @After
    public void tearDown() throws Exception {
        names = null;
        expected = null;
    }
}