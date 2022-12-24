package com.softserve.edu09.PracticalTask;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        go();
    }

    public static void go(){
        List <Integer> myCollection = MyPracticalTask.createCollection(10);
        System.out.println("My collection: "+myCollection);

        List <Integer> newCollection = MyPracticalTask.createNewCollection(myCollection);
        System.out.println("New collection: "+newCollection);

        myCollection = MyPracticalTask.insertElements(myCollection);

        myCollection = MyPracticalTask.removeElements(myCollection, 20);
        System.out.println("\nMy collection after removing: "+myCollection);

        Collections.sort(myCollection);
        System.out.println("\nMy collection after sorting: "+myCollection);
    }
}
