package com.imtiyaz.number;

/**
 * Created by imtiyaz on 8/3/17.
 */
public class Swap {

    public static void main(String[] args) {
        int a=3;
        int b=5;

        int temp;
        temp=b;
        b=a;
        a=temp;

        System.out.println(a);
        System.out.println(b);
    }

    public static void main2(String[] args) {
        // without temp variable
        int a=3;
        int b=10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
