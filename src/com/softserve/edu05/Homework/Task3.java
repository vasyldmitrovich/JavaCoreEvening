package com.softserve.edu05.Homework;

public class Task3 {
    /* Enter 5 integer numbers. Find
• position of second positive number;
• minimum and its position in the array.
Count the product of all entered even numbers */
    public static void main(String[] args) {

        int[] Numbers = {5, -11, -2, 2, 1};
        int imin = 0;
        int counter = 0;
        int prod = 1;
        int min = Numbers[imin];


        for (int n = 0; n< 5; n++) {
            if  (Numbers[n]<min)  {imin = n; min = Numbers[imin];}
            if (Numbers[n]>0) counter++;
            if (counter ==2)
            {System.out.println("position of second positive number is " + (n+1) );}
            if (Numbers[n] % 2 == 0) {prod *= Numbers[n];}
        }
        System.out.println("Minimum number is " + min +" on the position - " + (imin+1) + "\nProduct of all entered even numbers "+ prod);
    }
}
