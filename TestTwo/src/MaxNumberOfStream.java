package src;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaxNumberOfStream {
    public static void main(String[] args) {
        findMax();
    }

    private static void findMax() {

        Integer max = Stream.of(1, 3, 4, 8, 6, 9, 2)
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println(max);

        Integer max2 = IntStream.of(1, 3, 4, 8, 6, 9, 2)
                .max()
                .getAsInt();
        System.out.println(max2);

        Integer max3 = IntStream.of(1, 3, 4, 8, 6, 9, 2)
                .summaryStatistics()
                .getMax();
        System.out.println(max3);
    }
}
