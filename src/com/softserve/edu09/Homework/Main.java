package com.softserve.edu09.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        List<Integer> myCollection = declareCollection();
        System.out.println("My Collection " + myCollection);

        swapMaximumAndMinimum(myCollection);
        System.out.println("My Collection with swap the maximum and minimum " + myCollection);

        insertRandomThreeDigit(myCollection);
        System.out.println("random three-digit number before the first negative element " + myCollection);

        insertZeroBetween(myCollection);

        copyFirstKelements(myCollection, 5);

        removeLastEvenElement(myCollection);
        System.out.println("My Collection with remove the last even element " + myCollection);

        removeElementAfterFirstMinimum(myCollection);
        System.out.println("My Collection with remove the element following the first minimum " + myCollection);
    }




    public static List<Integer> declareCollection(){
        List<Integer> myCollection = new ArrayList<>();
        for (int i=0; i<10; i++){
            double random = (int) Math.round((Math.random() * 30) - 15);
            myCollection.add((int) random);
        }
        return myCollection;
    }


     public static List<Integer> swapMaximumAndMinimum(List<Integer> myCollection){
         int max = myCollection.indexOf(Collections.max(myCollection));
         int min = myCollection.indexOf(Collections.min(myCollection));
         Collections.swap(myCollection, max, min);

         return myCollection;
     }

    public static void insertRandomThreeDigit(List<Integer> myCollection) {
        for (int i=0; i< myCollection.size(); i++){
            double random = Math.random() * 1000;
            if (myCollection.get(i) < 0){
                myCollection.add(i, (int) random);
                break;
            }
        }
    }

    public static void insertZeroBetween (List<Integer> myCollection){
        for (int i = 0; i < myCollection.size()-1; i++){
            if (myCollection.get(i) * myCollection.get(i+1) < 0){
                myCollection.add(i+1, 0);
            }
        }
        System.out.println("with zero " + myCollection);
    }

    public static void copyFirstKelements(List<Integer> myCollection, int k){
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
        Collections.reverse(list2);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
    }

    public static void removeLastEvenElement(List<Integer> myCollection) {
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            try {
                if (myCollection.get(i) % 2 == 0) {
                    myCollection.remove(i);
                    break;
                }
            } catch (Exception e) {
                System.out.println("there is no such element in the Collection");
            }
        }
    }

     public static void removeElementAfterFirstMinimum(List<Integer> myCollection){
         int min = myCollection.indexOf(Collections.min(myCollection));
         try{
             myCollection.remove(min+1);
         }
         catch (Exception e){
             System.out.println("the minimum element is the last");
         }
     }





}
