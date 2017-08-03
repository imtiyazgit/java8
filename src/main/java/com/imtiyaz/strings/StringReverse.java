package com.imtiyaz.strings;

/**
 * Created by imtiyaz on 7/20/17.
 */
public class StringReverse {
    private static String reverse(String input) {
        if (input.length() == 1) {
            return input;
        }
        return reverse(input.substring(1)) + input.charAt(0);
    }

    public static void main2(String[] args) {
        System.out.println(reverse("hello"));
    }

    public static void main(String[] args) {

        String str = "Hello there";
        char[] arr = str.toCharArray();

        for(int j=arr.length-1; j>=0; j--) {
            System.out.print(arr[j]);
        }
    }
}
