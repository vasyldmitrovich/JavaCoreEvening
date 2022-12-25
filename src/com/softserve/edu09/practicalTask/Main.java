package com.softserve.edu09.practicalTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        List<Integer> myCollection = createListWithRandomNumbers(10);
        System.out.println("myCollection :" + myCollection);

        //Find and save all positions of element more than 5 in the myCollection. Print newCollection
        List<Integer> newCollection = findPositions(myCollection);
        System.out.println("newCollection: " + newCollection);

        //make copy to do tasks after removing some elements
        List<Integer> myCollectionCopy = new ArrayList<>(myCollection);

        //Remove from collection myCollection elements, which are greater than 20. Print result
        myCollection.removeIf(num -> num > 20);
        System.out.println("myCollection after removing numbers greater than 20: " + myCollection);

        //Insert elements 1, -3, -4 in positions 2, 8, 5.
        //Print result in the format: “position – xxx, value of element – xxx”
        insertAndPrint(myCollectionCopy);

        //sort and print collection
        Collections.sort(myCollectionCopy);
        System.out.println(myCollectionCopy);
    }
    public static void insertAndPrint(List<Integer> source){
        System.out.println("\n\nWorking on myCollectionCopy...");
        source.set(2,1);
        source.set(8,-3);
        source.set(5,-4);

        for(int i = 0; i < source.size(); i++){
            System.out.println("position - "  + i + ", value of element - " + source.get(i));
        }
    }

    public static List<Integer> findPositions(List<Integer> source){
        List<Integer> positionsList = new LinkedList<>();
        for(int i = 0; i < source.size(); i++){
            if(source.get(i) > 5){
                positionsList.add(i);
            }
        }
        return positionsList;
    }

    public static List<Integer> createListWithRandomNumbers(int numbersCount){
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < numbersCount; i++){
            integerList.add(random.nextInt(50));
        }
        return integerList;
    }
}
