package com.softserve.edu13.practicalTask.Array;

public class AppArray {
    public static void main(String[] args) {

        ArrayOfInteger arr = new ArrayOfInteger();
        int[] arrayNumb = {10, 15, 26, 54, 5, 6, 87, 89, 91, 99};

        CountEl ref1 = (numb) -> {
            if (numb % 3 == 0) return true;
            else return false;
        };

        int countElement = arr.count(arrayNumb, ref1);
        System.out.println("\nСума елементів, кратних \"3\":" + countElement);


        CountEl ref2 = (numb) -> {
            if (numb % 2 == 0) return true;
            else return false;
        };

        int countPairEl = arr.count(arrayNumb, ref2);
        System.out.println("\nСума парних елементів:" + countPairEl);

    }
}
