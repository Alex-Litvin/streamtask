import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class Task_6Test {
    private Stream<ArrayList<Integer>> stream;
    private List<Integer> expected;

    @Before
    public void setUp() throws Exception {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(6, 7, 8));
        ArrayList<Integer> third = new ArrayList<>(Arrays.asList(9, 10));
        stream = Stream.of(first, second, third);
        expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    @Test
    public void singleListShouldContainsAllElementsFromOtherArrayLists() {
        List<Integer> singleList = Task_6.collectToSingleList(stream);
        assertEquals(expected, singleList);
    }

    @Test
    public void singleListSizeShouldBeEqualsTotalSumOfSizeOtherArrayLists() {
        List<Integer> singleList = Task_6.collectToSingleList(stream);
        assertEquals(expected.size(), singleList.size());
    }

    @After
    public void tearDown() throws Exception {
        stream = null;
        expected = null;
    }
}