package com.imtiyaz.arrays;

/**
 * Created by imtiyaz on 8/2/17.
 */
public class FindPairToMatchSum {
    public static void main(String[] args) {
        int sum=7;
        int[] arr = {1,2,3,4,5,6,7};

        for (int i=0, j=arr.length - 1; i < arr.length && j >=i; ) {
            int currentSum = arr[i] + arr[j];

            if (currentSum == sum) {
                System.out.println("Found pair "+arr[i] +" and "+arr[j]);
                i++;
            } else if (currentSum > sum) {
                j--;
            } else {
                i++;
            }
        }


    }
}
