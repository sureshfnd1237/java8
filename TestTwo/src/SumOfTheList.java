package src;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfTheList {
    public static void main(String[] args) {
        sumOfList();
    }

    private static void sumOfList() {
        List<Integer> list = Arrays.asList(2,5,6);

        Integer sum1 = list.stream()
                .collect(Collectors.summingInt(Integer::valueOf));
        System.out.println(sum1);

        Integer sum2 = list.stream()
                .reduce(0, (tempSum, i)-> tempSum+i);
        System.out.println(sum2);

        Integer sum3 = list.stream()
                .mapToInt(Integer::valueOf)
                .sum();
        System.out.println(sum3);

        long sum4 = list.stream()
                .mapToInt(Integer::valueOf)
                .summaryStatistics()
                .getSum();
        System.out.println(sum4);

    }
}
