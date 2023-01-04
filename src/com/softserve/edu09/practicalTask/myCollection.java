package com.softserve.edu09.practicalTask;

import com.softserve.edu06.practicalTasks.car.UserEnter;

import java.util.ArrayList;
import java.util.List;

public class myCollection {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>(10);
        List<Integer> newCollection = new ArrayList<>();
        List<Integer> removeCollection = new ArrayList<>();
        System.out.println("Введіть 10 цілих чисел:");
        for (int i = 0; i < 10; i++){
            UserEnter.UserEnterNum("");
            myCollection.add(UserEnter.numb);
        }
        System.out.println(myCollection);
        for (int k=0; k < myCollection.size(); k++){
            if (myCollection.get(k) > 5){
                newCollection.add(k);
            }
        }

        System.out.println("__________________________");
        System.out.println(newCollection);

        for (Integer elG: myCollection){
            if (elG > 20){
               removeCollection.add(elG);
            }
        }
        myCollection.removeAll(removeCollection);

        System.out.println("__________________________");
        System.out.println(myCollection);

        newCollection.add(2,1);
        newCollection.add(5,-4);
        newCollection.add(8,-3);

        System.out.println("__________________________");
        for (int k=0; k < newCollection.size(); k++) {
            System.out.println("position: " + k + ", value of element: " + newCollection.get(k));
        }

        newCollection.sort(null);

        System.out.println("__________________________");
        System.out.println(newCollection);
    }
}
