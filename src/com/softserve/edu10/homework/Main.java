package com.softserve.edu10.homework;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> linkedSet1 = new LinkedHashSet<>();
        linkedSet1.add(1);
        linkedSet1.add(2);
        linkedSet1.add(3);
        linkedSet1.add(4);
        linkedSet1.add(5);

        Set<Integer> linkedSet2 = new LinkedHashSet<>();
        linkedSet2.add(6);
        linkedSet2.add(7);
        linkedSet2.add(1);
        linkedSet2.add(9);
        linkedSet2.add(10);

        System.out.println("set1 is: " + linkedSet1);
        System.out.println("set2 is: " + linkedSet2);

        System.out.println("union is: " + union(linkedSet1,linkedSet2));
        System.out.println("intersection is: " + intersect(linkedSet1, linkedSet2));
    }

    private static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new LinkedHashSet<>();
        union.addAll(set1);
        union.addAll(set2);
        return union;
    }

    private static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new LinkedHashSet<>(set1);
        union.retainAll(set2);
        return union;
    }
}
