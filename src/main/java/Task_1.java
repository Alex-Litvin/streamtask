import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alex", "John", "Oleg", "Peter", "Denny");
        System.out.println(getNamesWithOddIndices(names));
    }

    public static String getNamesWithOddIndices(List<String> names) {
        return names.stream()
                .filter(e -> names.indexOf(e) % 2 != 0)
                .map(e -> names.indexOf(e) + ". " + e)
                .collect(Collectors.joining(", "));
    }
}
