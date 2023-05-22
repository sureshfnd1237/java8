package src;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {6,1,2,3,4,5};
        secondLargestNumber(arr);
    }

    public static void secondLargestNumber(int[] arr){
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int element: arr){
            if(element > firstLargest){
                secondLargest = firstLargest;
                firstLargest = element;
            }else if (element > secondLargest){
                secondLargest = element;
            }
        }

        System.out.println(secondLargest);
    }
}
