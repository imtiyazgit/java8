package com.imtiyaz.number;

/**
 * Created by imtiyaz on 8/12/17.
 */
public class ArmStrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int temp = number;
        int result=0;
        while(number>0) {
            int modulo = number%10;
            result = result + modulo * modulo * modulo;
            number = number/10;
        }

        if (result == temp) {
            System.out.println("ArmStrong");
        } else {
            System.out.println("Its not arm strong number.");
        }
    }
}
