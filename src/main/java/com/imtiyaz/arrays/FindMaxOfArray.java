package com.imtiyaz.arrays;

/**
 * Created by imtiyaz on 7/23/17.
 */
public class FindMaxOfArray {

    public static void main(String[] args) {
        int[] arr = {4,2,6,8,1};
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
