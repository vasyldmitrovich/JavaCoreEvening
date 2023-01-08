package com.softserve.edu07;

import java.util.Arrays;
import java.util.Random;

public class SortingDouble {
    public static void main(String[] args) {

        double[] x = new double[10];
        Random rand = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = rand.nextDouble(100);
        }
        Arrays.sort(x);
        for (double j : x) {
            System.out.printf("%.2f\n", j);
        }
    }
}
