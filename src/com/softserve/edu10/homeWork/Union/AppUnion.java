package com.softserve.edu10.homeWork.Union;

import java.util.HashSet;
import java.util.Set;

public class AppUnion {
    public static void main(String[] args) {
        Union filledSet1 = new Union();
        Union filledSet2 = new Union();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        filledSet1.filledSet(set1);
        filledSet2.filledSet(set2);

        Union.union(set1, set2);
        Union.intersect(set1, set2);
    }
}
