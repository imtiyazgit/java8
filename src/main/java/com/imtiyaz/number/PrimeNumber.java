package com.imtiyaz.number;

/**
 * Created by imtiyaz on 8/10/17.
 */
public class PrimeNumber {
    private static boolean isPrime(int number) {
        for(int i=2;i<number;i++) {
            if(number%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int total = 100;
        for (int i = 2; i < total; i++) {
            //System.out.println(i + " Prime:" + isPrime(i));
            if(isPrime(i)) {
                System.out.print(i +" ");
            }
        }
    }
}
