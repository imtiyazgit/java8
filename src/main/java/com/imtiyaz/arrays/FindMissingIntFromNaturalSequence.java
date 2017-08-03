package com.imtiyaz.arrays;

/**
 * Created by imtiyaz on 7/20/17.
 */
public class FindMissingIntFromNaturalSequence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int length = arr.length+1;
        int expectedSum = (length * (length+1))/2;
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println(expectedSum-total);
    }
}
