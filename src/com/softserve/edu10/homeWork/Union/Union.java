package com.softserve.edu10.homeWork.Union;

import java.util.*;

public class Union {
    static int i = 1;
    public void filledSet(Set<Integer> setN){
        while (setN.size() < 10) {
            Random rnd = new Random();
            int min = 0;
            int max = 20;
            setN.add(min + Math.abs(rnd.nextInt()) % (max - min + 1));
        }

        System.out.println("Заповнюємо числами set" + i + ": " + setN);
        i++;
    }

    public static void union(Set <Integer> set1, Set <Integer> set2){
        Set<Integer> un = new HashSet<>();
        un.addAll(set1);
        un.addAll(set2);
        System.out.println("Результат об'єднання: " + un);
    }

    public static void intersect(Set <Integer> set1, Set <Integer> set2){
        Set<Integer> inters = new HashSet<>();
        for (Integer element: set2) {
            if(set1.add(element) == false){
                inters.add(element);
            }
        }
        System.out.println("Значення, які повторюються в обох множинах: " + inters);
    }

}
