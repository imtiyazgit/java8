package com.imtiyaz.number;

/**
 * Created by imtiyaz on 8/3/17.
 */
public class Swap {
    public static void main(String[] args) {
        int a=3;
        int b=10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
