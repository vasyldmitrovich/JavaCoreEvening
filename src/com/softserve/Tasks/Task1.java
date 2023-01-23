package com.softserve.Tasks;

import java.util.Scanner;

public class Task1 {
    public static void doTask1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println("Fibonacci sequence");
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }
}
