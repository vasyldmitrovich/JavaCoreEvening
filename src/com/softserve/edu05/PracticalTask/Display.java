package com.softserve.edu05.PracticalTask;

public class Display {

    /*I*/
    static void bigest(int[] Numbers) {
        int max = Numbers[0];
        int n = 1;

        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] > max) {
                max = Numbers[i];
                n = i + 1;
            }
        }
        System.out.println("Maximal number:" + max);
    }

    ;

    static void positSum(int[] Numbers) {
        int sum = 0;
        for (int n : Numbers) {
            if (n > 0) {
                sum = sum + n;
            }
        }
        System.out.println("Sum Positiv Numbers:" + sum);
    }


    static void AmountNeg(int[] Numbers) {
        int neg = 0;
        for (int n : Numbers) {
            if (n < 0) {
                neg = neg + 1;
            }
        }
        System.out.println("Amount of Negative Numbers:" + neg);


    }
}