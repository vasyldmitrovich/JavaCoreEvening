package com.softserve.edu13.PracticalTask.PracticalTask_4;

public class AppMain {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Number of matches: " + new Methods().count(array, integer -> integer %3 == 0));
    }
}
