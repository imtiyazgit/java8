package com.imtiyaz.number;

import java.util.*;

/**
 * Created by imtiyaz on 8/12/17.
 */
public class PrintPrimeFactorsOfANumber {
    public static void main(String[] args) {
        int num=1092;
        List primeFactors = new ArrayList();

        for(int i=2;i<=num; i++) {

            if(num%i == 0) {
                // number is divisble by i
                primeFactors.add(i);
                num = num/i;
                i--;  // Start from that element only i.e. 2,2,2,3,3,4,4,5,5,6,6,6,6,7,7,7,7 etc
            }
        }

        System.out.println(Arrays.toString(primeFactors.toArray()));
    }
}
