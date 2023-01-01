package com.softserve.edu09.MyProjects.Homework;

import java.util.ArrayList;
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
    }

    public void print() {
        System.out.println("myCollection: " + myCollection);
    }

    public void findMinMax() {
        for(int i = 0; i < myCollection.size(); i++) {

        }
    }

}
