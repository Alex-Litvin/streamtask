import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1, 2, 0", "4, 5");
        System.out.println(convert(list));
    }

    public static String convert(List<String> strings) {
        return strings.stream()
                .flatMap(s -> Arrays.stream(s.split(",")))
                .map(String::trim)
                .collect(Collectors.joining(", "));
    }
}
