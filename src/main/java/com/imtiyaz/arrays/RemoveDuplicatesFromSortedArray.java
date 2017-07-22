package com.imtiyaz.arrays;

/**
 * Created by imtiyaz on 7/20/17.
 */
public class RemoveDuplicatesFromSortedArray {
/*    static int[] removeDuplicatesInPlace(int[] input) { 
        int i = 1; // Move from one, leaving the first element as it is 
        int j = 0; // As we move on, when you find a mismatch between elements, replace at this index with the current element  
        while(i < input.length){ 
            if(input[i] == input[j]){ 
                i++; 
            } else {
                input[++j] = input[i++]; 
            } 
        }  
        // Already removed duplicates within this j elements. So, after j index, we don't want 
        int[] output = new int[j+1]; // Earlier, j started from 0. So add 1 here for length. 
        for(int k=0; k<output.length; k++){ 
            output[k] = input[k]; 
        }          return output;     }      public static void main(String a[]){         int[] input1 = {2,3,6,6,8,9,10,10,10,12,12};         int[] output = removeDuplicatesInPlace(input1);         for(int i:output){             System.out.print(i+" ");         }     } 
}*/

}
