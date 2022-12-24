package com.softserve.edu09.HomeTask;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        go();
    }

    public static void go(){
        List<Integer> myCollection = HomeTask.createCollection(10);
        System.out.println("Original list: "+myCollection);

        myCollection = HomeTask.swapElements(myCollection);
        System.out.println("List after swapping: "+myCollection);

        myCollection = HomeTask.insertNumber(myCollection);
        System.out.println("List after insert three-digit number: "+myCollection);

        myCollection = HomeTask.insertZero(myCollection);
        System.out.println("List after inserting zero: "+myCollection);

        HomeTask.copyElements(myCollection, 5);

        myCollection = HomeTask.removeEvenElement(myCollection);
        System.out.println("List after removing last even number: "+myCollection);

        myCollection = HomeTask.removeFistAfterMinimum(myCollection);
        System.out.println("List after removing element following the minimum: "+myCollection);
    }
}
