import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class Task_4Test {
    private Stream<Integer> first;
    private Stream<Integer> second;
    private Stream<Integer> expected;

    @Before
    public void setUp() throws Exception {
        first = Stream.of(1, 3, 5, 7);
        second = Stream.of(2, 4, 6);
        expected = Stream.of(1, 2, 3, 4, 5, 6);
    }

    @Test
    public void resultStreamShouldContainsElementsAlternatesElementsFromStreamFirstAndSecond() {
        Stream<Integer> result = Task_4.zip(first, second);
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void resultStreamSizeShouldBeSix() {
        Stream<Integer> result = Task_4.zip(first, second);
        assertEquals(result.toArray().length, expected.toArray().length);
    }

    @After
    public void tearDown() throws Exception {
        first = null;
        second = null;
        expected = null;
    }
}