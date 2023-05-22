package src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {
    public static void main(String[] args) {
        count();
    }

    //{r=1, d=1, e=1, w=1, h=1, l=3, o=2}
    public static void count(){
        String input = "Hello World";

        Map<String, Long> map = Arrays.stream(input.toLowerCase().replaceAll(" ", "")
                .split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(map);
    }
}
