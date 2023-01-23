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

        Random random = new Random(1);
        for (int i = 0; i < n; i++) {
         arrayList.add(random.nextInt());
        }

        System.out.println(arrayList);

        long numberZero = arrayList.stream()
                .filter(i->i==0)
                .count();

        System.out.println("Number zero: "+numberZero);

    }
}
