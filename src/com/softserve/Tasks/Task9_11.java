package com.softserve.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task9_11 {
    public static void doTask9(){
        System.out.println("Input number n");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        List<Integer> arrayList = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < n; i++) {
         arrayList.add(random.nextInt(2));
        }

        System.out.println(arrayList);

        long numberZero = arrayList.stream()
                .filter(i->i==0)
                .count();

        System.out.println("Number zero: "+numberZero);

    }

    public static void doTask10(){
        System.out.println("Input natural number n>1");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        int step = 0;
        while (n>1){
            if (n%2 == 0){
                n =n /2;
            }else {
             n = n*3+1;
            }
            step++;
        }
        System.out.println("Number of steps: "+step);

    }
}
