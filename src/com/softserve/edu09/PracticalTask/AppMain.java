package com.softserve.edu09.PracticalTask;

import java.util.*;

public class AppMain {
    public static void main(String[] args) {

        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(-20,100);
            myCollection.add(a);
        }
        System.out.println("1. My Collection:\n" + myCollection);
        System.out.println();
        List<Integer> newCollection = new ArrayList<>();
        for (Integer integer : myCollection) {
            if (integer > 5) {
                newCollection.add(myCollection.indexOf(integer));
            }
        }
        System.out.println("2. New Collection:\n" + newCollection);
        System.out.println();
        myCollection.removeIf(integer -> integer > 20);
        System.out.println("3. My Collection with removed elements:\n" + myCollection);
        System.out.println();
        try {
            newCollection.add(2,1);
            newCollection.add(8,-3);
            newCollection.add(5,-4);
        } catch (Exception exception) {
            System.out.println("Length is to small.");
        }
        System.out.println("4. New Collection with added elements:\n" + newCollection);
        System.out.println();
        myCollection.sort(new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("5. My sorted Collection:\n" + myCollection);
        System.out.println();
        newCollection.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("6. New sorted Collection:\n" + newCollection);
    }
}
