package com.softserve.edu09.PracticalTask;

import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        go();
    }

    public static void go() {
        List<Integer> myCollection = Practice.myPractice();
        System.out.println("My collection: " + myCollection);

        Collections.sort(myCollection);
        System.out.println("\nMy collection Sorted:  " +myCollection);

        List<Integer> newCollection = Practice.collectionMoreFive(myCollection);
        System.out.println("\nCollection More Five: " + newCollection);

        myCollection = Practice.insertElements(myCollection);

        myCollection = Practice.removeElements(myCollection);
        System.out.println("\nMy collection removed: " + myCollection);

        Collections.sort(myCollection);
        System.out.println("\nMy New collection Sorted:  " +myCollection);

    }
}






