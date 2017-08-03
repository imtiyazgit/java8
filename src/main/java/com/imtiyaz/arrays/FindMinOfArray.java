package com.imtiyaz.arrays;

/**
 * Created by imtiyaz on 7/23/17.
 */
public class FindMinOfArray {
    public static void main(String[] args) {
        int[] arr = {5,2,4,8};
        int f_smallest = arr[0];
        int s_smallest = arr[1];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < f_smallest) {
                s_smallest = f_smallest;
                f_smallest = arr[i];
            }
        }

        System.out.println("f_smallest"+f_smallest);
        System.out.println("s_smallest"+s_smallest);
    }
}
