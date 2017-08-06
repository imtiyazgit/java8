package com.imtiyaz.arrays;

import java.util.Arrays;

/**
 * Created by imtiyaz on 8/3/17.
 */
public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3, 5,7,9,11};
        int[] arr2 = {2,3,4,6,8};
        int[] result = new int[arr1.length + arr2.length];

        int i = 0, j=0, index=0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[index++] = arr1[i++];
                continue;
            }  else if (arr1[i] > arr2[j]){
                result[index++] = arr2[j++];
            } else {
                // if elements are same
                result[index++] = arr1[i];
                i++; j++;
            }
        }

        while(i < arr1.length) {
            result[index++] = arr1[i++];
        }

        while(j < arr2.length) {
            result[index++] = arr2[j++];
        }

        System.out.println(Arrays.toString(result));

    }
}
