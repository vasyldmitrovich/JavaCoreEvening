package com.softserve.edu05.PracticalTasks5;

public class MyArrays {
    static void findBiggest(int[] myArray){
        int max = myArray[0];
        int imax=1;
        for (int i=1; i<myArray.length; i++){
            if (myArray[i]>max) {
                max = myArray[i];
                imax = i+1;
            }
        }

        System.out.println("Max number is "+max+". It position is "+imax);
    }

    static void findSumPositiveNumbers(int[] myArray){
        int sum=0;

        for (int element:myArray){
            if (element>0){
                sum = sum+element;
            }
        }

        System.out.println("Sum positive numbers is "+sum);
    }

    static void findAmountNegativeNumbers(int[] myArray){
        int amountN = 0;
        int amountP = 0;

        for (int element:myArray){
            if (element<0){
                amountN++;
            } else if (element>0) {
                amountP++;
            }
        }

        System.out.println("Amount of negative numbers is "+amountN);

        if (amountP>amountN) {
            System.out.println("There are more positive numbers");
        } else if (amountN>amountP) {
            System.out.println("There are more negative numbers");
        } else{
            System.out.println("There are equally positive and negative numbers");
        }
    }
}
