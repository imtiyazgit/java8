package com.imtiyaz.strings;

/**
 * Created by imtiyaz on 8/2/17.
 */
public class CheckIfStringIsPalindrome {
    public static void main(String[] args) {
        String str = "GrerG";

        char[] arr = str.toCharArray();

        boolean isPalindrome = true;
        for(int i=0, j = arr.length-1; i < arr.length && j >=0; i++, j--) {
           if(arr[i] != arr[j]) {
               isPalindrome = false;
           }
        }
        System.out.println("Is Palindrome "+isPalindrome);
    }
}
