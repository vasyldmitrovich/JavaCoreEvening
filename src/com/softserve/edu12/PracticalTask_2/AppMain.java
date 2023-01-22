package com.softserve.edu12.PracticalTask_2;

import java.util.Arrays;

public class AppMain {
    public static void main(String[] args) throws ColorException, TypeException {

        Plant[] flowers = {
                new Plant(5, "Black", "Rose"),
                new Plant(8, "Red", "Cardinal"),
                new Plant(3, "White", "Dock"),
                new Plant(2, "Orange", "Sunflower"),
                new Plant(20, "Yellow", "Iris"),
        };
        System.out.println(Arrays.toString(flowers));
    }
}
