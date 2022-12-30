package com.softserve.edu09.MyProjects.PracticalTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>(10);

        Random r = new Random();
//        myCollection.add(r.nextInt(10));
//        myCollection.add(r.nextInt(10));
        for (int i = 0; i < myCollection.size(); i++) {
            int j = r.nextInt(10);
            myCollection.add(j);
        }

        System.out.println(myCollection);


    }
}
