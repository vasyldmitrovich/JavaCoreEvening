package com.softserve.edu05.practicalTask;

public class Task1 {
    public static void main(String[] args) {
        start();
    }

    public static void start(){

        int[] array = {4,-5,3,-2,76,11,52,-101,9,12};

        //find the biggest number
        System.out.println("The biggest number in array is: " + findTheBiggestNumber(array));

        //the sum of positive numbers in array
        System.out.println("Sum of positive numbers is: " + getSumOfPositiveNumbers(array));

        //the amount of negative numbers in array and amount of positive numbers
        compareNegativeAndPositiveNumbersCount(array);
    }

    public static int findTheBiggestNumber(int[] array){
        int theBiggestNumber = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > theBiggestNumber){
                theBiggestNumber = array[i];
            }
        }
        return theBiggestNumber;
    }

    public static int getSumOfPositiveNumbers(int[] array){
        int sumOfPositiveNumbers = 0;

        for (int i = 0; i < array.length; i++){
            if(array[i] > 0){
                sumOfPositiveNumbers+=array[i];
            }
        }
        return sumOfPositiveNumbers;
    }

    public static void compareNegativeAndPositiveNumbersCount(int[] array){
        int negativeNumbers = 0;
        int positiveNumbers = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > 0){
                positiveNumbers++;
            }else{
                negativeNumbers++;
            }
        }
        System.out.println("Count of negative numbers: " + negativeNumbers);
        System.out.println("Count of positive numbers: " + positiveNumbers);
        System.out.println(positiveNumbers > negativeNumbers ? "More positive values" :
                positiveNumbers == negativeNumbers ? "Count of positive and negative numbers is equal" :
                        "More negatives");

    }
}
