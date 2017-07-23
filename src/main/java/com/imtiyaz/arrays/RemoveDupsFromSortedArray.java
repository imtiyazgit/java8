package com.imtiyaz.arrays;

import java.util.Arrays;

/**
 * Created by imtiyaz on 7/22/17.
 */
public class RemoveDupsFromSortedArray {

    public static void usingResultsArray(String[] args) {
        int[] arr = {1,5,5,6,9,9};
        int[] result = new int[arr.length];

        for (int i = 0, j=0; i < arr.length; i++) {
            if (arr.length-1 == i) {
                result[j++] = arr[i];
                break;
            }
            if(arr[i] != arr[i+1]) {
                result[j++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(result));

    }

    public static void main(String[] args) {
        int[] arr = {1,5,5,5,5,6,9,9};

        int j=0;
        for (int i = 1; i < arr.length; ) {
            if(arr[i] == arr[j]) {
                System.out.println("Dup found "+arr[i]);
                i++;
            } else {
                arr[++j] = arr[i++];
            }
        }

        // If you want after j elements, set -1 to indicate these elements are not required
        for (int k = j+1; k < arr.length; k++) {
            arr[k] = -1;
        }
        System.out.println(Arrays.toString(arr));

    }
}
