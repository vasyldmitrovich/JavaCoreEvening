package com.softserve.edu09.PracticalTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Practice {

    static List<Integer> myPractice() {
        List<Integer> myCollection = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myCollection.add(new Random().nextInt(100, 1000));
        }
        return myCollection;
    }
    public static List <Integer> collectionMoreFive(List <Integer> myCollection) {

        List <Integer> newCollection = new ArrayList <>();
        for (int i = 5; i < myCollection.size(); i++) {
            newCollection.add(myCollection.get(i));
        }

        return newCollection;
    }

    public static List <Integer> removeElements(List <Integer> myCollection){
        myCollection.removeIf(n->(n>20));
        return myCollection;
    }

    public static List<Integer> insertElements(List<Integer> myCollection) {
        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);

        System.out.println("My collection after inserting elements:");
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Value of element: " + myCollection.get(i)+ ", Position: " + i);
        }

        return myCollection;
    }




}
