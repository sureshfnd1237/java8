package src;

import java.util.stream.Stream;

public class ConcatenatingStreams {
    public static void main(String[] args) {
        concatenate();
    }

    private static void concatenate() {
        Stream s1 = Stream.of("Suresh", "Naresh");
        Stream s2 = Stream.of("Naveen", "Praveen");

        Stream s3 = Stream.concat(s1, s2);

        s3.forEach(System.out::println);
    }
}
