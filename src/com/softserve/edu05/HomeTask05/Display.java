package com.softserve.edu05.HomeTask05;

import java.util.Arrays;
import java.util.Collections;

public class Display {

    public static void main(String[] args) {
        int Numbers[] ={4, 12, -8, 6, -22, 33, 2, 45, 9,2 -21};
        int sum = 0;
        int n=0;

        //Sum
        for (int i = 0; i < Numbers.length; i++) {
            if (n < 0){
                continue;
            }
            sum += n;
        }
        System.out.println("Sum = " + sum);

        //Amount
        int amount = 0;
        for (int n : Numbers) {
            if (n > 0) {
                continue;
            }
            amount += 1;
        }
        System.out.println("Amount = " + amount);

        //Max
        int max = Collections.max(Arrays.asList(Numbers));
        System.out.println("Maximal number = " + max);
    }


}
