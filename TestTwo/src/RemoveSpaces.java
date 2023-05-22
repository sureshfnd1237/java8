package src;

import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveSpaces {
    public static void main(String[] args) {
        removeLeadingSpaces(" Hello How Are You ");
        removeSpaces("Welcome      To Java");
        removeSpacesUsingChars("My Java Learning");
        removeSpacesUsingCharsInJava8("My Java Learning");
    }

    public static void removeLeadingSpaces(String input) {
        //to remove leading and training spaces, we use strip() or trim(). Strip() is recommended as this uses unicode characters
        String s = input.strip();
        System.out.println(s);
    }

    public static void removeSpaces(String input) {

        String s = input.replaceAll(" ", "");
        System.out.println(s);
    }

    public static void removeSpacesUsingChars(String input) {

        StringJoiner sj = new StringJoiner("");
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                sj.add(String.valueOf(input.charAt(i)));
            }
        }
        System.out.println(sj);
    }

    public static void removeSpacesUsingCharsInJava8(String input) {

        StringJoiner sj = new StringJoiner("");

        IntStream.range(0, input.length())
                .filter(i -> input.charAt(i) != ' ')
                .forEach(i -> sj.add(String.valueOf(input.charAt(i))));
        System.out.println(sj);
    }
}
