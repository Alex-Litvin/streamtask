import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task_2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alex", "John", "Oleg", "Peter", "Denny");
        System.out.println(getReverseOrderedUpperCaseNames(names));
    }

    public static List<String> getReverseOrderedUpperCaseNames(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
