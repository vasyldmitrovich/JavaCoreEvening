package com.softserve.edu09.Homework;

import java.util.ArrayList;
import java.util.List;

public class ThreeDigitNumber {
    public static void main(String[] args) {
        List<Integer> myCollection1 = new ArrayList<>();
        myCollection1.add(12);
        myCollection1.add(6);
        myCollection1.add(-4);
        myCollection1.add(1111);
        myCollection1.add(12);
        myCollection1.add(6);
        myCollection1.add(-4);
        myCollection1.add(1111);


        for (int i = 0; i < myCollection1.size(); i++) {
            if ((myCollection1.get(i) > 0 && myCollection1.get(i + 1) < 0) ||
                    (myCollection1.get(i) < 0 && myCollection1.get(i + 1) > 0)) {
                myCollection1.add((i), 0);
            }
        } System.out.println(myCollection1);

    }
}
