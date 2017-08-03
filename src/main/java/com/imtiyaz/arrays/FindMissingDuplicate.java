package com.imtiyaz.arrays;

/**
 * Created by imtiyaz on 7/20/17.
 */
public class FindMissingDuplicate {
    public static void main(String[] args) {
        int[] arr = { 3, 16, 3};
        int miss = arr[0];

        for (int i = 1; i < arr.length; i++) {
            miss = miss ^ arr[i];
        }

        System.out.println(miss);

    }
}
