package com.imtiyaz.arrays;

import java.util.Arrays;

/**
 * Created by imtiyaz on 7/23/17.
 */
public class MoveZerosToEndOfArray {
    public static void main(String[] args) {
        int[] arr =  {0,2,4,1,4,7};

        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] !=0) {
                arr[j++] = arr[i];
            }
        }

        for(int k=j; k<arr.length;k++) {
            arr[k] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
