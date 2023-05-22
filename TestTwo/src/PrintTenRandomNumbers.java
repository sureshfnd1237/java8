package src;

import java.util.Random;

public class PrintTenRandomNumbers {
    public static void main(String[] args) {
        printRandomNumbers();
    }

    private static void printRandomNumbers() {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }
}
