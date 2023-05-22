package src;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountStringsGreaterThan3Length {

    public static void main(String[] args) {
        countStrings();
    }

    private static void countStrings() {
        Long count = Stream.of("Suresh", "Naresh", "Ravi", "Abu", "abc", "ira")
                .filter(s -> s.length() > 3)
                .count();
        System.out.println(count);
    }
}
