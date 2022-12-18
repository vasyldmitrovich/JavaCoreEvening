package com.softserve.edu04.PracticalTasks;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        
        int count = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);


    }
}
