package com.softserve.edu09.homeWork;

import java.util.*;

public class myCollections{
    List<Integer> myHomeCollection = new LinkedList<Integer>();

    public void createList(){
        for (int i = 0; i < 10; i++){
            Random rnd = new Random();
            int min = -1000;
            int max = 1000;
            myHomeCollection.add(min + Math.abs(rnd.nextInt()) % (max - min + 1));
        }
        System.out.println("myHomeCollection:  " + myHomeCollection);
        System.out.println("_________________________");
    }

    public void getMaxMin(){
        System.out.println("Максимальне значення: " + Collections.max(myHomeCollection, null));
        System.out.println("Мінімальне значення: " + Collections.min(myHomeCollection, null));
        System.out.println("_____________________________");
    }


    public void insertNumber() {
        int newRandom;
        Random rnd1 = new Random();
        int min1 = 100;
        int max1 = 999;
        newRandom = min1 + Math.abs(rnd1.nextInt()) % (max1 - min1 + 1);

        for (Integer el2 : myHomeCollection) {
            if (el2 < 0) {
                int position = myHomeCollection.indexOf(el2);
                myHomeCollection.add(position, newRandom);
                break;
            }
        }
        System.out.println("myHomeCollection (insert a random three-digit number):  " + myHomeCollection);
        System.out.println("_________________________");
    }

    public void insertZero(){
        for (int i = 0; i < myHomeCollection.size()-1; i++) {
            if ((myHomeCollection.get(i) > 0 && myHomeCollection.get(i + 1) < 0) ||
                    (myHomeCollection.get(i) < 0 && myHomeCollection.get(i + 1) > 0)) {
                myHomeCollection.add(i + 1, 0);
                i += 2;
            }
        }
        System.out.println("myHomeCollection (insert a zero between all neighboring elements" +
                " with different signs):  " + myHomeCollection);
        System.out.println("_________________________");
    }

    public void subList(){
            List<Integer> list1 = new LinkedList<>(myHomeCollection.subList(0,5));
            System.out.println("list1: " + list1);

            List<Integer> list2 = new LinkedList<>(myHomeCollection.subList(5,myHomeCollection.size()));
            Iterator<Integer> iterator = list2.listIterator(list2.size());
            System.out.print("list2: ");
            while (((ListIterator<Integer>) iterator).hasPrevious()) {
                System.out.print(((ListIterator<Integer>) iterator).previous() + " " );
            }
            System.out.println("\n" + "_________________________");
    }

        public void removeLastEl(){
            int size = myHomeCollection.size();
            if(myHomeCollection.get(size-1)%2 == 0 ){
                myHomeCollection.remove(size-1);
                System.out.println("After removing the last even element: " + myHomeCollection);
            } else {
                System.out.println("The last element is odd");
                System.out.println("_________________________");
            }
    }

        public void removeElement(){
            int size = myHomeCollection.size();
            int indexOfMin = myHomeCollection.indexOf(Collections.min(myHomeCollection));
            if (indexOfMin < (size - 1)) {
                myHomeCollection.remove(indexOfMin + 1);
            }
            System.out.println("After removing the element following the first minimum: " + myHomeCollection);
        }
    }


