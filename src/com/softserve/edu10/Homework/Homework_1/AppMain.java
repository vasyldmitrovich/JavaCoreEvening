package com.softserve.edu10.Homework.Homework_1;

import java.util.HashSet;
import java.util.Set;

public class AppMain {
    public static void main(String[] args) {

        Set<Object> set1 = new HashSet<>();
        set1.add("Nazar");
        set1.add(11);
        set1.add("Dima");
        set1.add("Oleg");
        set1.add("Olia");
        set1.add(12);
        System.out.println("Set 1: " + set1);

        Set<Object> set2 = new HashSet<>();
        set2.add(66);
        set2.add("Ivan");
        set2.add("Oleg");
        set2.add("Olia");
        set2.add("Oleksandr");
        set2.add(11);
        System.out.println("Set 2: " + set2);

        System.out.println("Union: " + new Methods().union(set1, set2));
        System.out.println("Intersection: " + new Methods().intersection(set1, set2));

    }
}
