package src;

import java.util.StringJoiner;

public class AddPrefixANdSuffix {
    public static void main(String[] args) {
        addPefixAndSuffix();
    }

    public static void addPefixAndSuffix(){
        String input="Suresh";

        StringJoiner sj = new StringJoiner("", "Hello ", " How Are You");
        sj.add(input);
        System.out.println(sj.toString());
    }
}
