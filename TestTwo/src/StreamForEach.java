package src;

import java.util.Arrays;
import java.util.List;

public class StreamForEach {
    public static void main(String[] args) {
        streamForEach();
    }

    private static void streamForEach() {

        List<String> list = Arrays.asList("Suresh", "Ramesh", "Naresh");
        list.stream().forEach(System.out::println);
    }
}
