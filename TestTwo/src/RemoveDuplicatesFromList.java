package src;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {
        removeDuplicates();
    }

    private static void removeDuplicates() {
        List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 4, 5, 6, 7, 7, 8);
        Set<Integer> set = new HashSet<>();

        list.stream()
                .forEach(e -> set.add(e));

        set.stream().forEach(System.out::print);
        System.out.println();

        list.stream().collect(Collectors.toSet()).stream().forEach(System.out::print);
    }
}
