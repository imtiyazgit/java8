package com.imtiyaz.number;

/**
 * Created by imtiyaz on 8/3/17.
 */
public class Fibonacci {
    public static void main(String[] args) {
        int first =0;
        int second= 1;

        System.out.print(first + " " + second);
        for (int i=0; i<15; i++) {
            int sum = first+second;
            first = second;
            second = sum;
            System.out.print(" "+sum);
        }
    }
}
