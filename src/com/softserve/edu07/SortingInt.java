package com.softserve.edu07;

import java.util.Arrays;
import java.util.Random;

public class SortingInt {
    public static void main(String[] args) {

        int[] x = new int[10];
        Random rand = new Random();

        for (int i = 0; i < x.length; i++) {
            x[i] = rand.nextInt(100);
        }

        Arrays.sort(x);

        for (int j : x) {
            System.out.println(j);
        }
    }
}
