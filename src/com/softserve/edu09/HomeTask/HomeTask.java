package com.softserve.edu09.HomeTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeTask {
    public static List <Integer> createCollection(int capacity){
        List<Integer> myCollection = new ArrayList<>();

        Random rn = new Random();
        for (int i = 0; i < capacity; i++) {
            myCollection.add(i, rn.nextInt(-20, 50));
        }

        return myCollection;
    }

    public static List<Integer> swapElements(List<Integer> myCollection){
        int max, min;
        int posMax = 0, posMin = 0;
        int tmp;

        max = myCollection.get(0);
        min = myCollection.get(0);
        for (int i = 1; i < myCollection.size(); i++) {
            tmp = myCollection.get(i);
            if (min> tmp){
                min = tmp;
                posMin = i;
            }
            if (max<tmp){
                max = tmp;
                posMax = i;
            }
        }

        myCollection.set(posMax, min);
        myCollection.set(posMin, max);

        return myCollection;
    }

    public static List<Integer> insertNumber(List<Integer> myCollection){
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i)<0) {
                Random rn = new Random();
                myCollection.add(i, rn.nextInt(100,999));
                break;
            }
        }
        return myCollection;
    }

    public static List<Integer> insertZero(List<Integer> myCollection){
        List<Integer> newCollection = new ArrayList<>();
        int tmp;
        for (int i = 0; i < myCollection.size()-1; i++) {
            tmp = myCollection.get(i);
            newCollection.add(tmp);
            if (tmp*myCollection.get(i+1)<0){
                newCollection.add(0);
            }
        }

        return newCollection;
    }

    public static void copyElements(List<Integer> myCollection, int k){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1 = myCollection.subList(0,k);

        for (int i = myCollection.size()-1; i >=k ; i--) {
            list2.add(myCollection.get(i));
        }

        System.out.println("List 1: "+list1);
        System.out.println("List 2: "+list2);
    }

    public static List<Integer> removeEvenElement(List<Integer> myCollection){
        boolean evenFind = false;
        int pos = 0;

        for (int i = myCollection.size()-1; i >0 ; i--) {
            if (myCollection.get(i)%2==0){
                evenFind = true;
                pos = i;

                break;
            }
        }

        if (evenFind){
            myCollection.remove(pos);
        }
        else {
            System.out.println("Even number doesn't find");
        }

        return myCollection;
    }

    public static List<Integer> removeFistAfterMinimum(List<Integer> myCollection){
        int min;
        int posMin = 0;
        int tmp;

        min = myCollection.get(0);
        for (int i = 1; i < myCollection.size(); i++) {
            tmp = myCollection.get(i);
            if (min> tmp){
                min = tmp;
                posMin = i;
            }
        }

        if (posMin+1<myCollection.size()){
            myCollection.remove(posMin+1);
        }

        return myCollection;
    }
}
