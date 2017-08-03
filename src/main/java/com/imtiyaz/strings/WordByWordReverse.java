package com.imtiyaz.strings;

/**
 * Created by imtiyaz on 8/2/17.
 */
public class WordByWordReverse {
    public static void main(String[] args) {
        String str = "Hello, Imtiyaz Baig!";
        String[] arr = str.split(" ");

        for (int j=arr.length-1; j>=0; j--) {
            System.out.print(arr[j] + " ");
        }

    }
}
