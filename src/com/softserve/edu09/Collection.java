package com.softserve.edu09;

import java.util.*;

public class Collection {
    private final List<Integer> myCollection;
    private final List<Integer> newCollection;

    public Collection (int sizeCol, int bound) {
        myCollection = new ArrayList<>(sizeCol);
        newCollection = new ArrayList<>();

        Random randomNum = new Random();
        for (int i = 0; i < sizeCol; i++) {
            myCollection.add(randomNum.nextInt(bound));
        }

        print();
        printCopyNewCollection();
        printGreater20();
        printAfterInsert();
        printSortedCol();
    }

    public void print () {
        System.out.println("myCollection: " + myCollection);
    }

    public void printCopyNewCollection () {
        for (Integer integer : myCollection) {
            if (integer > 5) {
                newCollection.add(integer);
            }
        }
        System.out.println("newCollection(print >5): " + newCollection);
    }

    public void printGreater20() {
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(i);
            }
        }
        System.out.println("myCollection(remove elements >20): " + myCollection);
    }

    public void printAfterInsert() {
        System.out.println("Add 3 element:");
        myCollection.add(2,1);
        myCollection.add(5,-4);
        myCollection.add(8,-3);
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position : " + i +
                    ", value of element : " + myCollection.get(i));
        }
    }

    public void printSortedCol() {
        Collections.sort(myCollection);
        System.out.println("Sorted myCollection: " + myCollection);
    }





}