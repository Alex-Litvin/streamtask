import java.util.Iterator;
import java.util.stream.Stream;

public class Task_4 {
    public static void main(String[] args) {
        Stream<String> stream = zip(Stream.of("1", "2", "3"), Stream.of("a", "b"));
        stream.forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> secondAsIterator = second.iterator();
        Stream.Builder<T> builder = Stream.builder();
        first.forEach((e) -> {
            if (secondAsIterator.hasNext()) {
                builder.accept(e);
                builder.accept(secondAsIterator.next());
            } else {
                first.close();
            }
        });
        return builder.build();
    }
}
