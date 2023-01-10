package com.softserve.edu09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyCollection {
    public static void main(String[] args) {
    runFirstTask();
    runSecondTask();
    runThirdTask();
    runFourthTask();

}
    /*For each task
    use separate methods
    Each method accepts some parameters and performs one action, such as removing something from the collection
    And in main method must be called only one method for example run()*/

        public static void runFirstTask() {

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
            System.out.println(myCollection + " it's myCollection");
        }

        /*Find and save in list newCollection
        all positions of element more than 5 in the collection. Print newCollection*/

        /*Use to resolve that task new method, and you send list in that method and method return new list,
        * after that you create variable List<Integer> newCollection = (there use that method)              DONE*/
        public static ArrayList <Integer> setNewList(List <Integer> list) {
            return list.stream()
                    .filter(integer -> integer > 5)
                    .collect(Collectors.toCollection(ArrayList::new));
            }

            static void runSecondTask() {
        List<Integer> myCollection = new ArrayList<>();
        myCollection.add(12);
        myCollection.add(6);
        myCollection.add(50);
        myCollection.add(1111);
        myCollection.add(100);
        myCollection.add(-4);
        myCollection.add(0);
        myCollection.add(19);


            System.out.println(setNewList(myCollection)+ " it's newCollection");
        }

        //Remove from collection myCollection elements, which are greater then 20. Print result

    static void runThirdTask() {
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

        myCollection.removeIf(integer -> integer > 20);
        System.out.println(myCollection + " removed elements greater then 20");
    }

        //Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”
        static void runFourthTask() {
            List<Integer> myCollection = new ArrayList<>();
            myCollection.add(12);
            myCollection.add(6);
            myCollection.add(50);
            myCollection.add(1111);
            myCollection.add(100);
            myCollection.add(-4);
            myCollection.add(0);
            myCollection.add(19);

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
