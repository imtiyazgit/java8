package com.imtiyaz.arrays;

import java.util.Arrays;

/**
 * Created by imtiyaz on 7/23/17.
 */
public class MoveZerosToEndOfArray {
    public static void main(String[] args) {
        int[] arr =  {3,0,4,1,0,7,0};

        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] !=0) {
                arr[j++] = arr[i];
            }
        }

        for(int k=j+1; k<arr.length;k++) {
            arr[k] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
