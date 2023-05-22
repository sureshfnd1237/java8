package src;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    //This approach is called memorization approach where we store each intermediate results in the map and use them for further processing.
    static Map<Integer, Integer> map= new HashMap<>();

    public static void main(String[] args) {

        //0 1 1 2 3 5 8 13 21 34
        for (int i = 0; i < 10; i++) {
            map.put(i, fibonacci(i));
        }

        map.values().stream().
                forEach(i-> System.out.print(i+" "));
    }

    public static int fibonacci(int input) {

        if (input == 0 || input == 1) {
            return input;
        } else if (map.containsKey(input)) {
            return map.get(input);
        }
        return fibonacci(input - 1) + fibonacci(input - 2);
    }
}
