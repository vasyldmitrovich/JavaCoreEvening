package com.softserve.edu09.PracticalTask;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        runPractical();
    }

    static void runPractical() {
        List<Integer> myCollection = new ArrayList<>();
        List<Integer> newCollection = new ArrayList<>();
        int index = -1;
        for (int i = 0; i < 10; i++) {
            myCollection.add(new Random().nextInt(30));
        }
        System.out.println(myCollection);

        for (Integer num : myCollection) {
            index++;
            if (num > 5) {
                newCollection.add(index);
            }
        }

        System.out.println(newCollection + " Indexes of elements >5");
        myCollection.removeIf(e -> e > 20);
        System.out.println(myCollection + " Changed(removed elements >20)"); //1, -3, -4 //2, 8, 5

        try {
            myCollection.set(2, 1);//   .add
            myCollection.set(8, -3);//  .add
            myCollection.set(5, -4);//  .add
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Not enough space");
        }
        System.out.println(myCollection + " Changed (inserted elements)"); //insert means add or set?

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.printf("Position - %d, value of element - %d \n", i, myCollection.get(i));
        }


    }

}
