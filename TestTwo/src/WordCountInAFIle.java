package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountInAFIle {

    public static void main(String[] args) throws IOException {
        countWords();
    }

    private static void countWords() throws IOException {

        Path p = Paths.get("D:/workspace/ws1/TestTwo/input/input.txt");
        List<String> words = new ArrayList<>();
        Files.lines(p)
                .map(e -> e=e.replaceAll(".", ""))
                        .forEach(line -> System.out.println(Arrays.asList(line.split(" "))));
//                .forEach(line -> words.addAll(Arrays.asList(line.split(" "))));

        System.out.println(words);
        Map<String, Long> map = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
