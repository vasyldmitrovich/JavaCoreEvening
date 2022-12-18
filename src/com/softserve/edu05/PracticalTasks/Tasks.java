package com.softserve.edu05.PracticalTasks;

public class Tasks {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        the biggest of these numbers

        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                index = i;
            }
        }
        System.out.println("The biggest number of array[" + index + "]: " + max);


//        the sum of positive numbers in the array

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                sum = sum + array[i];
            }
        }
        System.out.println("Sum of positive numbers: " + sum);

//        the amount of negative numbers in the array

        int amount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                amount++;
            }
        }
        System.out.println("The amount of negative numbers: " + amount);

    }
}
