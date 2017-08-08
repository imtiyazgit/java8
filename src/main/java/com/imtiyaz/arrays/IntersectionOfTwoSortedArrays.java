package com.imtiyaz.arrays;

import java.util.Arrays;

/**
 * Created by imtiyaz on 8/6/17.
 */
public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1= {1,3,5,6};
        int[] arr2={2,5,6};
        int[] result = new int[arr1.length+arr2.length];

        for (int i = 0, j=0, index=0; i < arr1.length && j<arr2.length; ) {
            if(arr1[i] < arr2[j]) {
                i++;
            } else if(arr1[i] > arr2[j]) {
                j++;
            } else {
                result[index++] = arr1[i];
                i++; j++;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
