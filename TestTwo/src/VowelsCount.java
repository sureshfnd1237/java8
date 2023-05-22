package src;

import java.util.stream.Stream;

public class VowelsCount {

    public static void main(String[] args) {
        countVowels("Suresh");
    }

    public static void countVowels(String input) {

        long vowelsCount = Stream.of(input.split(""))
                .filter(s -> "aeiouAEIOU".indexOf(s) >= 0)
                .count();

        System.out.println(vowelsCount);
    }
}
