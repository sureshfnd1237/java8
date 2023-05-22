package src;

import java.util.stream.Stream;

public class MultiplyWith3InTheList {
    public static void main(String[] args) {
        multiply();
    }

    private static void multiply() {
        Stream.of(1, 2, 3, 4, 5)
                .map(e -> e * 3)
                .forEach(System.out::println);
    }
}
