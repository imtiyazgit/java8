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

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}
