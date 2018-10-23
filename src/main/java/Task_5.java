import java.util.stream.Stream;

public class Task_5 {
    public static void main(String[] args) {
        randomStream(0, 25214903917L, 11, (long) Math.pow(2, 48))
                .forEach(System.out::println);
    }

    private static Stream<Long> randomStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, e -> (a * e + c) % m);
    }
}
