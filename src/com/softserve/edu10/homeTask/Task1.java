package com.softserve.edu10.homeTask;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,6,8));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4,5,2,6,9));

        Set<Integer> unionSet = union(set1,set2);
        System.out.println(unionSet);

        Set<Integer> intersectedSet = intersect(set1,set2);
        System.out.println(intersectedSet);
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2){
        Set<T> tempSet = new HashSet<>();
        tempSet.addAll(set1);
        tempSet.retainAll(set2);
        return tempSet;
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2){
        Set<T> tempSet = new HashSet<>();
        tempSet.addAll(set1);
        tempSet.addAll(set2);
        return tempSet;
    }
}
