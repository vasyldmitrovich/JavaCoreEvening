package com.softserve.edu09.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumbersCollection {
    public static void main(String[] args) {

        runFirstTask();
        runSecondTask();
        runThirdTask();
    }
    static void runFirstTask() {
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

        Collections.swap(myCollection, myCollection.indexOf(Collections.min(myCollection)), myCollection.indexOf(Collections.max(myCollection)));
        System.out.println(myCollection + "  swaped the maximum and minimum elements");
    }

        //Insert a random three-digit number before the first negative element of the list

        static void runSecondTask() {
            List<Integer> myCollection = new ArrayList<>();
            myCollection.add(12);
            myCollection.add(6);
            myCollection.add(50);
            myCollection.add(1111);
            myCollection.add(100);
            myCollection.add(-4);

        int number = (int) (100+ Math.random()*899);
            for (int i = 0; i < myCollection.size(); i++) {
                if (myCollection.get(i) < 0) {
                    myCollection.add(i, number);
                    break;
                }
            }
        System.out.println(myCollection + " inserted a random three-digit number");
    }


            /*Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the
       list2 in reverse order.*/

    static void runThirdTask() {
        List<Integer> myCollection = new ArrayList<>();
        myCollection.add(12);
        myCollection.add(6);
        myCollection.add(50);
        myCollection.add(1111);
        myCollection.add(100);
        myCollection.add(-4);
        List <Integer> list1 = new ArrayList<>();
        List <Integer> list2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a random number 1-10");
        int k = scanner.nextInt();

        for (int i = 0; i < k; i++) {
                list1.add(myCollection.get(i));
            }
        for (int i = myCollection.size()-1; i >=k; i--) {
                list2.add(myCollection.get(i));
            }
        System.out.println("First " +  k + "elements of the myCollection in direct order: " + list1);
        System.out.println("Last elements of the myCollection in reverse order: " + list2);
    }
}
