package com.imtiyaz.strings;

/**
 * Created by imtiyaz on 8/6/17.
 */
public class StringToInt {
    public static void main(String[] args) {
        char c = '0';
        int ci = c;
        System.out.println("char is: "+c +" and its ascii is: "+ci);

        // So, if char c is casted to int, it takes its ascii. In this case, '0' ascii is 48, so it prints 48..
        // To get'0' to 0, then remove 48

        System.out.println('0'-48);
    }

    public static void main2(String[] args) {
        String str = "123";

        int result = 0;

        for(char ch: str.toCharArray()) {
            result = result*10 + ch - 48;
        }

        System.out.println(result);
    }
}
