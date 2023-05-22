package src;

import java.util.Arrays;
import java.util.stream.Stream;

public class SumOfAllElementsInArray {

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};//15
        sum(arr);
    }
    public static void sum(Integer[] arr){
        int sum = Arrays.stream(arr).mapToInt(Integer::valueOf).sum();
        System.out.println(sum);
    }
}
