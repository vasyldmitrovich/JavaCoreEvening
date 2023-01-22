package com.softserve.edu09.practical_task;

import com.softserve.edu09.GetCollection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        newList();
        System.out.println("=======================================");
        del();
        System.out.println("=======================================");
        insert();
        System.out.println("=======================================");
        sort();
    }

    private static void newList() {
        LinkedList<Integer> myCollection = new LinkedList<>(GetCollection.myList());
        LinkedList<Integer> newCollection = new LinkedList<>();

        System.out.println(myCollection);
        for (int x : myCollection) {
            if (x > 5) {
                newCollection.add(x);
            }
        }
        System.out.println(newCollection);
    }

    private static void del() {
        LinkedList<Integer> myCollection = new LinkedList<>(GetCollection.myList());
        System.out.println(myCollection);
        for (int x = 0; x < myCollection.size(); x++) {
            if (myCollection.get(x) > 20) {
                myCollection.remove(x);
                x--;
            }
        }
        System.out.println(myCollection);
    }

    private static void insert() {
        LinkedList<Integer> myCollection = new LinkedList<>(GetCollection.myList());
        myCollection.set(2, 1);
        myCollection.set(8, -3);
        myCollection.set(5, -4);

        System.out.println(myCollection);
        for (int x = 0; x < myCollection.size(); x++) {
            System.out.println("position: " + x + ", value of element: " + myCollection.get(x));
        }
    }

    private static void sort() {
        LinkedList<Integer> myCollection = new LinkedList<>(GetCollection.myList());
        System.out.println(myCollection);
        Collections.sort(myCollection);
        System.out.println(myCollection);
    }
}
