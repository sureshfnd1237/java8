package src;

import java.util.HashMap;
import java.util.Map;

public class Factorial {

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.print(result);
    }

    public static int factorial(int input) {
        if (input == 1) {
            return 1;
        }
        return input * factorial(input - 1);
    }
}
