import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task_6 {
    public static void main(String[] args) {
        ArrayList<String> first = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        ArrayList<String> second = new ArrayList<>(Arrays.asList("e", "f", "g"));
        ArrayList<String> third = new ArrayList<>(Arrays.asList("q", "p"));

        collectToSingleList(Stream.of(first, second, third))
                .forEach(System.out::println);
    }

    public static <T> List<T> collectToSingleList(Stream<ArrayList<T>> stream) {
        List<T> list = stream.flatMap(Collection::stream).collect(Collectors.toList());
        IntStream range = IntStream.range(0, list.size());
        List<T> result = new ArrayList<>(Arrays.asList((T[]) (new Object[list.size()])));
        range.parallel().forEach(e -> result.set(e, list.get(e)));
        return result;
    }
}
