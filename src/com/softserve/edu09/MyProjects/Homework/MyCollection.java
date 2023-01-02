package com.softserve.edu09.MyProjects.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MyCollection {

    private List<Integer> myCollection;
    //private List<Integer> newCollection;
    private Random randomNum;

    public MyCollection (int sizeCol, int bound) {
        myCollection = new ArrayList<>(sizeCol);
        //newCollection = new ArrayList<>();

        randomNum = new Random();
        for (int i = 0; i < sizeCol; i++) {
            myCollection.add(randomNum.nextInt(bound));
        }
        print();
        swapMinMax();
    }

    public void print() {
        System.out.println("myCollection: " + myCollection);
    }

    public void swapMinMax() {

        int min = 0, max = myCollection.get(0);
        int index = 0, index1 = 0;
        for(int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > min) {
                min = myCollection.get(i);
                index = i;
            }
            if (myCollection.get(i) < max) {
                max = myCollection.get(i);
                index1 = i;
            }
        }
//        System.out.println("max: " + tmp + " - " + a);
//        System.out.println("min: " + tmp1 + " - " + b);
        myCollection.set(index, max);
        myCollection.set(index1, min);
        System.out.println("Swapped first min-max elements: " + myCollection);
    }

}
