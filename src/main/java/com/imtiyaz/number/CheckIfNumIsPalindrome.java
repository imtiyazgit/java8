package com.imtiyaz.number;

/**
 * Created by imtiyaz on 8/2/17.
 */
public class CheckIfNumIsPalindrome {
    public static void main(String[] args) {
        int num = 1234321;
        int result =0;
        int temp = num;

        while (num>0) {
            result = result*10 + num%10;
            num/=10;
        }

        if(temp == result) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Num is not palindrome!");
        }
    }
}
