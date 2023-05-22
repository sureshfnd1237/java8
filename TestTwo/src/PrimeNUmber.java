package src;

import java.util.stream.IntStream;

public class PrimeNUmber {

    public static void main(String[] args) {
        isPrime(49);
    }

    public static void isPrime(int input){

        Long count = IntStream.range(2, input/2)
                .filter(i -> input%i == 0)
                .count();

        if(input==0 || input==1 || count > 0){
            System.out.println("not a prime");
        }else{
            System.out.println("prime");
        }

    }
}
