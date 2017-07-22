package com.imtiyaz.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by imtiyaz on 7/21/17.
 */
public class FindMultiDups {
    /*public static void main(String[] args) {
        int[] arr = {2,5,6,4,5,1,2};

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("dup found "+ arr[i]);
                }
            }
        }
    }*/

    public static void main(String[] args) {
        int[] arr = {2,5,6,4,5,1,2};

        Set set = new HashSet();

        for (int i = 0; i < arr.length; i++) {
            if(!set.add(arr[i])) {
                System.out.println("Dup "+arr[i]);
            }
        }
    }
}
