package com.softserve.edu09.homework;

import com.softserve.edu09.GetCollection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        changePosition();
        System.out.println("============================================");
        randomNumber();
        System.out.println("============================================");
        insertZero();
        System.out.println("============================================");
        copy();
        System.out.println("============================================");
        delEven();
        System.out.println("============================================");
        delMin();
    }

    private static void changePosition() {
        ArrayList<Integer> myCollection = new ArrayList<>(GetCollection.myList());
        System.out.println(myCollection);

        int maxPosition = myCollection.indexOf(Collections.max(myCollection));
        int minPosition = myCollection.indexOf(Collections.min(myCollection));
        int minValue = Collections.min(myCollection);
        int maxValue = Collections.max(myCollection);
        myCollection.set(minPosition, maxValue);
        myCollection.set(maxPosition, minValue);

        System.out.println(myCollection);
    }

    private static void randomNumber() {
        Random random = new Random();
        ArrayList<Integer> myCollection = new ArrayList<>(GetCollection.myList());
        System.out.println(myCollection);

        for (int value : myCollection) {
            if (value < 0) {
                myCollection.add(myCollection.indexOf(value), random.nextInt(900) + 100);
                break;
            }
        }
        if (Collections.min(myCollection) >= 0) {
            System.out.println("There are no negative numbers in this collection");
        } else {
            System.out.println(myCollection);
        }
    }

    private static void insertZero() {
        ArrayList<Integer> myCollection = new ArrayList<>(GetCollection.myList());
        System.out.println(myCollection);

        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) > 0 && myCollection.get(i + 1) < 0) {
                myCollection.add(i + 1, 0);
            }
            if (myCollection.get(i) < 0 && myCollection.get(i + 1) > 0) {
                myCollection.add(i + 1, 0);
            }
        }
        System.out.println(myCollection);
    }

    private static void copy() {
        ArrayList<Integer> myCollection = new ArrayList<>(GetCollection.myList());
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        Random random = new Random();
        int k = random.nextInt(myCollection.size()) + 1;
        System.out.println("Random is: " + k);

        for (int i = 0; i < myCollection.size() - (myCollection.size() - k); i++) {

            list1.add(myCollection.get(i));
        }
        for (int i = myCollection.size() - 1; i > (k - 1); i--) {

            list2.add(myCollection.get(i));
        }
        System.out.println(myCollection);
        System.out.print(list1);
        System.out.println(list2);
    }

    private static void delEven() {
        ArrayList<Integer> myCollection = new ArrayList<>(GetCollection.myList());
        System.out.println(myCollection);

        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                break;
            }
        }
        if (myCollection.size() == 10) {
            System.out.println("There are no even elements in this List");
        } else {
            System.out.println(myCollection);
        }
    }

    private static void delMin() {
        ArrayList<Integer> myCollection = new ArrayList<>(GetCollection.myList());
        System.out.println(myCollection);
        int minValue = myCollection.get(0);
        int minPosition = 0;

        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) < minValue) {
                minValue = myCollection.get(i);
                minPosition = i;
            }
        }
        myCollection.remove(minPosition);
        System.out.println(myCollection);
    }
}
