package com.softserve.edu09.PracticalTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyPracticalTask {
    public static List<Integer> createCollection(int capacity){
        List <Integer> myCollection = new ArrayList<>();

        Random rn = new Random();
        for (int i = 0; i < capacity; i++) {
            myCollection.add(rn.nextInt(40));
        }

        return myCollection;
    }

    public static List <Integer> createNewCollection(List <Integer> myCollection) {

        List <Integer> newCollection = new ArrayList <>();
        for (int i = 5; i < myCollection.size(); i++) {
            newCollection.add(myCollection.get(i));
        }

        return newCollection;
    }

    public static List <Integer> removeElements(List <Integer> myCollection, int limit){
        myCollection.removeIf(n->(n>limit));
        return myCollection;
    }

    public static List<Integer> insertElements(List <Integer> myCollection){
        myCollection.add(2,1);
        myCollection.add(8,-3);
        myCollection.add(5, -4);

        System.out.println("My collection after inserting elements:");
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position: "+i+", value of element: "+myCollection.get(i));
        }

        return myCollection;
    }
}
