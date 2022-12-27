package com.softserve.edu09.PracticalTask;

import java.util.*;

public class myCollection {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        List<Integer> myCollection = declareCollection();
        System.out.println("My Collection " + myCollection);

        List<Integer> newCollection = declareNewCollection(myCollection);
        System.out.println("New Collection " + newCollection);

        myCollection = removeFromMycollection(myCollection);
        System.out.println("Remove myCollection elements, which are greater then 20 " + myCollection);

        myCollection = insertElements(myCollection);

        Collections.sort(myCollection);
        System.out.println("Sort " + myCollection);

    }



    public static List<Integer> declareCollection(){
        List<Integer> myCollection = new ArrayList<>();
        int a = 50;
        for (int i=0; i<10; i++){
            double random = Math.random() * a;
            myCollection.add((int) random);
        }
        return myCollection;
    }

    public static List<Integer> declareNewCollection(List<Integer> myCollection){
        List<Integer> newCollection = new ArrayList<>();
        for (int i=0; i<myCollection.size(); i++){
            if (myCollection.get(i) > 5){
                newCollection.add(myCollection.get(i));
            }
        }
        return newCollection;
    }


    public static List<Integer> removeFromMycollection(List<Integer> myCollection){
        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 20){
                iterator.remove();
            }
        }
        return myCollection;
    }

    public static List<Integer> insertElements(List<Integer> myCollection) throws IndexOutOfBoundsException{
       try {
           myCollection.add(2, 1);
           myCollection.add(8, -3);
           myCollection.add(5, 4);
       }
       catch (IndexOutOfBoundsException e){
           System.out.println("IndexOutOfBoundsException");
       }

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position " + i + ", value of element " + myCollection.get(i));
        }
        return myCollection;
    }




}
