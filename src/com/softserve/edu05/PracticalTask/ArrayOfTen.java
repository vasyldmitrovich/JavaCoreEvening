package com.softserve.edu05.PracticalTask;

public class ArrayOfTen {
    public static void main(String[] args) {
        int [] arr= {31, 9, 1, -6, 61, 99, 3, 0, -15, 78};
                                                //the biggest of these numbers;
        int imax = 0;
        int max = arr[imax];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                imax = i;
                max = arr[imax];
            }
        }
        System.out.print("Maximum = " + max);
        System.out.println(" is in " + (imax + 1) + " place");


                                            //the sum of positive numbers in the array;
        int sum = 0;
        for (int j : arr) {
            if (j > 0) {
                sum = sum + j;
            }
        }
        System.out.println("Sum = " + sum);
                                            //the amount of negative numbers in the array

        int counter = 0;
        for (int j : arr) {
            if (j < 0) {
                counter++;
            }

        }
        System.out.println(" The amount of negative numbers is " + counter);


                                            // What values there are more: negative or positive?
        if (arr.length-counter < counter) {
            System.out.println( "the amount of negative numbers is more");}
        else {System.out.println ("the amount of positive numbers is more");}
         }
    }
