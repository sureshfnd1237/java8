package src;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String args[]){

        reverseString("Suresh");
        reverseStringUsingReduceFunction("Suresh");
    }

    public static void reverseString(String input){
       String reversedString  = IntStream.range(0, input.length())
               .boxed()
               .sorted(Collections.reverseOrder())
               .map(i-> String.valueOf(input.charAt(i)))
               .collect(Collectors.joining());

       System.out.println("Given String is "+ input + " Reversed String is "+reversedString);

    }

    public static void reverseStringUsingReduceFunction(String input){

        String reversedString = Arrays.stream(input.split(""))
                        .reduce("", (temp, s) -> s+temp);

        System.out.println("Given String is "+ input + " Reversed String is "+reversedString);

    }
}
