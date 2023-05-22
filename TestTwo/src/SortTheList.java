package src;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheList {
    public static void main(String[] args) {
        sortList();
    }

    private static void sortList() {

        List<Integer> list = Arrays.asList(6, 5, 7, 8, 3, 9, 2, 1);

        list.sort(Comparator.comparing(Integer::valueOf));
        System.out.println(list);

        List<Integer> list2 = list.stream()
                .sorted(Comparator.comparing(Integer::valueOf))
                .collect(Collectors.toList());
        System.out.println(list2);
    }
}
