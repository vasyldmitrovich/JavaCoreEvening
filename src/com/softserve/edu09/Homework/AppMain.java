package com.softserve.edu09.Homework;

import java.util.*;

public class AppMain {
    public static void main(String[] args) {

        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(-20, 100);
            myCollection.add(a);
        }
        System.out.println("1. My Collection:\n" + myCollection);
        System.out.println();

        int indexMax = myCollection.indexOf(Collections.max(myCollection));
        int indexMin = myCollection.indexOf(Collections.min(myCollection));
        int valueMax = Collections.max(myCollection);
        int valueMin = Collections.min(myCollection);
        myCollection.set(indexMin, valueMax);
        myCollection.set(indexMax, valueMin);
        System.out.println("2. My Collection with changed maximum and minimum values:\n" + myCollection);
        System.out.println();

        for (Integer integer : myCollection) {
            if (integer < 0) {
                myCollection.add(myCollection.indexOf(integer), random.nextInt(-20, 100));
                myCollection.add(myCollection.indexOf(integer), random.nextInt(-20, 100));
                myCollection.add(myCollection.indexOf(integer), random.nextInt(-20, 100));
                break;
            }
        }
        System.out.println("3. My Collection with three-digit random number before the first negative element of the list:\n" + myCollection);
        System.out.println();

        for (int i = 0; i < myCollection.size() - 1; i++) {
            for (int j = i + 1; j < myCollection.size(); j++) {
                if (myCollection.get(i) > 0 & myCollection.get(j) < 0 || myCollection.get(i) < 0 & myCollection.get(j) > 0) {
                    myCollection.add(j, 0);
                    i = j;
                } else {
                    i++;
                }
            }
        }
        System.out.println("4. My Collection with inserted zero between all neighboring elements with different signs:\n" + myCollection);
        System.out.println();

        List<Integer> list1 = new ArrayList<>(), list2 = new ArrayList<>();
        for (int i = 0; i < myCollection.size() / 2; i++) {
            list1.add(myCollection.get(i));
        }
        for (int i = myCollection.size() / 2; i < myCollection.size(); i++) {
            list2.add(myCollection.get(i));
        }
        Collections.reverse(list2);
        System.out.println("5. List1 in direct order:\n" + list1);
        System.out.println();
        System.out.println("6. List2 in reverse order:\n" + list2);
        System.out.println();

        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) > 0) {
                System.out.println("7.1. Element removed is: " + myCollection.get(i));
                myCollection.remove(i);
                break;
            } else if (i == 0 & myCollection.get(0) < 0){
                System.out.println("There are no even numbers in the list.");
            }
        }
        System.out.println("7.2. My Collection with the last even element removed:\n" + myCollection);
        System.out.println();

        for (Integer integer : myCollection) {
            if (Objects.equals(integer, Collections.min(myCollection)) & myCollection.indexOf(integer) != myCollection.size() - 1) {
                System.out.println("8.1. Element removed is:" + myCollection.get(myCollection.indexOf(integer) + 1));
                myCollection.remove(myCollection.indexOf(integer) + 1);
                break;
            }
        }
        System.out.println("8.2. My Collection with the element following the first minimum removed:\n" + myCollection);
    }
}
