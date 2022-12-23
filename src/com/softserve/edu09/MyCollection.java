package com.softserve.edu09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyCollection {
    public static void main(String[] args) {

        List<Integer> myCollection = new ArrayList<>();
        myCollection.add(12);
        myCollection.add(6);
        myCollection.add(50);
        myCollection.add(1111);
        myCollection.add(100);
        myCollection.add(-4);
        myCollection.add(0);
        myCollection.add(19);
        myCollection.add(8);
        myCollection.add(18);
        System.out.println(myCollection +" it's myCollection");

        /*Find and save in list newCollection
        all positions of element more than 5 in the collection. Print newCollection*/

        List <Integer> newCollection = new ArrayList<>();

        for (Integer integer : myCollection) {
            if (integer > 5) {
                newCollection.add(integer);
            }
        }
        System.out.println(newCollection + " it's newCollection");

        //Remove from collection myCollection elements, which are greater then 20. Print result

        myCollection.removeIf(integer -> integer > 20);
        System.out.println(myCollection + " removed elements greater then 20");

        //Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”
        myCollection.add(2, 1);
        myCollection.add(5, -4);
        myCollection.add(8, -3);
        for (int i=0; i< myCollection.size(); i++) {
            System.out.println("position - " + (i+1) + ", value of element - " + myCollection.get(i));
        }

        //Sort and print collection
        Collections.sort(myCollection);
        System.out.println(myCollection + " has been sorted");
    }
}
