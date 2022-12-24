package com.softserve.edu09.HomeTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        runHome();
    }

    static void runHome() {
        List<Integer> myCollection = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myCollection.add(new Random().nextInt(30 + 15) - 15);
        }
        System.out.println(myCollection);

        Collections.swap(myCollection, myCollection.indexOf(findMax(myCollection)), myCollection.indexOf(findMin(myCollection)));
        System.out.println(myCollection + " Swapped min and max");

        for (Integer num : myCollection) {
            if (num < 0) {
                insertFirst(myCollection, myCollection.indexOf(num));
                break;
            }

        }
        System.out.println(myCollection + " Inserted random 3-digit before first negative");

        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) * myCollection.get(i - 1) < 0) {
                indexes.add(i);
            }
        }
        insertBetween(myCollection, indexes);
        System.out.println(myCollection + " Inserted 0 between different signs");

        copyTo(myCollection, list1, list2, 5);
        System.out.println(list1 + " First 5 in direct order");
        System.out.println(list2 + " First 5 in reverse order");


        removeEven(myCollection);
        System.out.println(myCollection + " removed last even");

        removeAfterMin(myCollection);
        System.out.println(myCollection + " removed element after min");


    }

    static int findMax(List<Integer> list) {
        int MAX = Integer.MIN_VALUE;
        for (Integer num : list) {
            if (num > MAX) MAX = num;
        }
        return MAX;
    }

    static int findMin(List<Integer> list) {
        int MIN = Integer.MAX_VALUE;
        for (Integer num : list) {
            if (num < MIN) MIN = num;
        }
        return MIN;
    }

    static void insertFirst(List<Integer> list, int index) {
        try {
            list.add(index, new Random().nextInt(999 + 100) - 100);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Cant add before first element");
        }

    }

    static void insertBetween(List<Integer> list, List<Integer> indexes) {

        for (int i = 0; i < indexes.size(); i++) {
            list.add(indexes.get(i), 0);
            if (i == indexes.size() - 1) break;
            for (int j = i; j < indexes.size(); j++) {
                indexes.set(j, indexes.get(j) + 1);
            }
        }
    }

    static void copyTo(List<Integer> list, List<Integer> list1, List<Integer> list2, int k) {
        for (int i = 0; i < k; i++) {
            list1.add(list.get(i));
        }
        for (int i = k - 1; i >= 0; i--) {
            list2.add(list.get(i));
        }
    }

    static void removeEven(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            try {
                if (list.get(i) % 2 == 0) {
                    list.remove(list.lastIndexOf(list.get(i)));
                    break;
                }
            } catch (Exception e) {
                System.out.println("No such element");
            }
        }
    }

    static void removeAfterMin(List<Integer> list) {
        try {
            list.remove(list.indexOf(findMin(list)) + 1);
        } catch (Exception e) {
            System.out.println("Min is the last element");
        }
    }

}
