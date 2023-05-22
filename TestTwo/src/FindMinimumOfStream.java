package src;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindMinimumOfStream {
    public static void main(String[] args) {
        findMinimum();
    }

    private static void findMinimum() {

        Integer min = IntStream.of(2, 4, 5, 6, 10)
                .min().getAsInt();
        System.out.println(min);

        Integer min2 = Stream.of(2, 4, 6, 1, 5, 7)
                .min(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println(min2);
    }
}
