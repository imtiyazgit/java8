package com.imtiyaz.arrays;

import java.util.Arrays;

/**
 * Created by imtiyaz on 7/23/17.
 */
public class UnionOfSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2={2,4};

        int counter=0;
        int[] result = new int[arr1.length+arr2.length];

        for (int i = 0, j=0; i < arr1.length && j <arr2.length; ) {
            if(arr1[i] < arr2[j]) {
                result[counter++] = arr1[i]; i++;
            } else {
                result[counter++] = arr2[j]; j++;
            }
        }

        if (arr1.length > arr2.length) {
            for(int i=arr2.length; i<arr1.length; i++) {
                result[counter++] = arr1[i];
            }
        }

        System.out.println(Arrays.toString(result));

    }
}
