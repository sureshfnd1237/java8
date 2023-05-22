package src;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class palindrome {
    public static void main(String[] args) {
        palindrome("suresh");
        palindromeUsingStream("suresh");
    }
    public static void palindrome(String input) {
        boolean flag = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(input+" is palindrome");
        } else {
            System.out.println(input+ " is not a palindrome");
        }
    }

    //using stream
    public static void palindromeUsingStream(String input) {
        Boolean isPalindrome = IntStream.range(0, input.length()/2)
                .noneMatch(i-> input.charAt(i)!=input.charAt(input.length()-1-i));
        System.out.println(input + " is palindrome:"+ isPalindrome);
    }

}
