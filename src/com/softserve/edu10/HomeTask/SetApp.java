package com.softserve.edu10.HomeTask;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetApp {
    public static Set union(Set set1, Set set2){
        set1.addAll(set2);

        return set1;
    }

    public static Set createSet1(){
        Set<String> set = new HashSet<>();

        set.add("First");
        set.add("Second");
        set.add("Third");

        return set;
    }

    public static Set createSet2(){
        Set<String> set = new HashSet<>();

        set.add("Fourth");
        set.add("Fifth");
        set.add("First");

        return set;
    }

    public static Set intersect(Set set1, Set set2){

        set1.retainAll(set2);

        return set1;
    }

    public static void printSet(Set set, String s){
        Iterator iterator = set.iterator();
        System.out.println(s);

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
