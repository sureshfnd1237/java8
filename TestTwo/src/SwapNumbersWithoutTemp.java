package src;

public class SwapNumbersWithoutTemp {

    public static void main(String[] args) {
        swap();
    }

    public static void swap(){

        int a=6;
        int b=4;
        System.out.println("Before swap "+"a="+a+" b="+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After swap "+"a="+a+" b="+b);

    }
}
