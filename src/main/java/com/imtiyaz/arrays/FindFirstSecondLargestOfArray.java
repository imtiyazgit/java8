package com.imtiyaz.arrays;

/**
 * Created by imtiyaz on 7/23/17.
 */
public class FindFirstSecondLargestOfArray {
    public static void main(String[] args) {
        int[] arr = {4,5};
        int f_largest = arr[0];
        int s_largest = arr[1];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > f_largest) {
                s_largest = f_largest;
                f_largest = arr[i];
            }
        }

        System.out.println("First largest "+f_largest);
        System.out.println("Second largest "+s_largest);
    }
}
