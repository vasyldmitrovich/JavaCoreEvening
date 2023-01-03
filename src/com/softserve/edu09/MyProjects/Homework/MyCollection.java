package com.softserve.edu09.MyProjects.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MyCollection {

    private List<Integer> myCollection;
    private List<Integer> newCollection;
    private Random randomNum;

    public MyCollection (int sizeCol) {
        myCollection = new ArrayList<>(sizeCol);
        newCollection = new ArrayList<>();

        randomNum = new Random();
        for (int i = 0; i < sizeCol; i++) {
            myCollection.add(randomNum.nextInt(20 + 10) - 5);
        }
        print();
        swapMinMax();
        insertNum();
        insertZero();
    }

    public void print() {
        System.out.println("myCollection: " + myCollection);
    }

/*
Swap the maximum and minimum elements in the list
*/
    public void swapMinMax() {
        newCollection = new ArrayList<>();
        newCollection.addAll(myCollection);
        int min = newCollection.get(0), max = newCollection.get(0);
        int index = 0, index1 = 0;
        for(int i = 0; i < newCollection.size(); i++) {
            if (newCollection.get(i) > min) {
                min = newCollection.get(i);
                index = i;
            }
            if (newCollection.get(i) < max) {
                max = newCollection.get(i);
                index1 = i;
            }
        }
        System.out.println("max: " + min  + ", index " + index);
        System.out.println("min: " + max + ", index " + index1);
        newCollection.set(index, max);
        newCollection.set(index1, min);
        System.out.println("Swapped first min-max elements: " + newCollection);
    }

/*
Insert a random three-digit
number before the first negative element of the list
*/
    public void insertNum() {
        newCollection = new ArrayList<>();
        newCollection.addAll(myCollection);
        for(int i = 0; i < newCollection.size(); i++) {
            if (newCollection.get(i) < 0) {
                newCollection.add(i, randomNum.nextInt(9));
                newCollection.add(i + 1, randomNum.nextInt(9));
                newCollection.add(i + 2, randomNum.nextInt(9));
                break;
            }
        }
        System.out.println("Insert 3 random number before first negative number: " + newCollection);
    }

/*Insert a zero between all neighboring
elements collection myCollection with different signs
*/
    public void insertZero() {
        for(int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i,0);
                myCollection.add(i + 2,0);
                i = i + 2;
            }
//            if (myCollection.get(i) > 0 && myCollection.get(i + 1) < 0) {
//                myCollection.add(i,0);
//                continue;
//            }
        }
        System.out.println("Insert zero: " + myCollection);
    }

}