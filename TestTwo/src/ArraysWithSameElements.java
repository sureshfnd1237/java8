package src;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysWithSameElements {

    public static void main(String[] args) {
        Integer[] a1 = {1,2,3};
        Integer[] a2= {1,2,3,4};
        Integer[] a3= {1,2,3,1,2};

        Boolean sameElements1  = sameElements(a1, a2);
        System.out.println(sameElements1);
        Boolean sameElements2 = sameElements(a1, a3);
        System.out.println(sameElements2);
    }

    public static Boolean sameElements(Integer[] input1, Integer[] input2){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(input1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(input2));
        System.out.println(set1);
        System.out.println(set2);

        if(set1.size() != set2.size()){
            return false;
        }else{
            return set2.stream()
                    .noneMatch(i-> !set1.contains(i));
        }
    }
}
