package com.softserve.edu09.homeTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        List<Integer> myCollection = createListWithRandomNumbers(10);
        System.out.println(myCollection);

        //swap max and min
        swapMaxWithMin(myCollection);
        System.out.println("\nAfter swapping min and max: " + myCollection);

        //Insert a random three-digit number before the first negative element of the list
        insertNumber(myCollection);
        System.out.println("\nAfter inserting a random three-digit number before the first negative element: " + myCollection);

        //Insert a zero between all neighboring elements collection myCollection with different signs
        insertZero(myCollection);
        System.out.println("\nAfter zeroes inserting: " + myCollection);

        //Copy the first k elements of the myCollection to the list1, in direct order,
        //and the rest to the list2 in reverse order.
        copyKNumbersOfElements(myCollection, 4);

        //remove last even
        removeLastEvenElement(myCollection);
        System.out.println("\nAfter last even removing: " + myCollection);

        //remove element after minimum
        removeAfterMinimum(myCollection);

        System.out.println("\nAfter removing the element following the first minimum: " + myCollection);
    }

    public static void removeAfterMinimum(List<Integer> source){
        int min = Collections.min(source);
        int minIndex = source.indexOf(min);
        if(minIndex != source.size()-1) source.remove(minIndex+1);
    }


    public static void copyKNumbersOfElements(List<Integer> source, int k){
        List<Integer> list1 = copyToFirstList(source, k);
        System.out.println("\nFirst " + k + " elements of myCollection" + list1);
        List<Integer> list2 = copyToSecondList(source, k);
        System.out.println("Rest elements of myCollection in reverse order" + list2);
    }

    public static void removeLastEvenElement(List<Integer> source){
        for(int i = source.size() - 1; i >= 0; i--){
            if(source.get(i) % 2 == 0){
                source.remove(i);
                return;
            }
        }

        System.out.println("No evens");
    }

    public static List<Integer> copyToFirstList(List<Integer> source, int k){
        return new ArrayList<>(source.subList(0,k));
    }

    public static List<Integer> copyToSecondList(List<Integer> source, int k){
        List<Integer> tempList = new ArrayList<>(source.subList(k,source.size()));
        Collections.reverse(tempList);
        return tempList;
    }

    public static void insertZero(List<Integer> source){
        List<Integer> tempList = new ArrayList<>();
        tempList.add(source.get(0));

        for(int i = 1; i < source.size(); i++){
            int element = source.get(i);
            int prevElement = source.get(i-1);
            if((element >= 0 && prevElement < 0) || (prevElement >= 0 && element < 0)){
                tempList.add(0);
                tempList.add(element);
            }else{
                tempList.add(element);
            }
        }

        source.clear();
        source.addAll(tempList);
    }

    public static void insertNumber(List<Integer> source){
        int random = new Random().nextInt(999-100)+100;
        for (int i = 0; i < source.size(); i++){
            if(source.get(i) < 0){
                source.add(i, random);
                break;
            }
        }
    }

    public static void swapMaxWithMin(List<Integer> source){
        int max = Collections.max(source);
        int min = Collections.min(source);
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);

        source.set(source.indexOf(max), min);
        source.set(source.indexOf(min), max);
    }

    public static List<Integer> createListWithRandomNumbers(int numbersCount){
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < numbersCount; i++){
            integerList.add(random.nextInt(50 + 50) - 50); // random from 50 to (-50)
        }
        return integerList;
    }
}
