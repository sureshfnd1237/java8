package src;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CubeOfNumbersAndFilter {
    public static void main(String[] args) {
        cuberAndFilter();
    }

    private static void cuberAndFilter() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.stream()
                .map(i -> i * i * i)
                .filter(i -> i > 50)
                .forEach(System.out::println);
    }
}
