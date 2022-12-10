package com.softserve.edu05.practicalTask;

public class Task1 {
    public static void main(String[] args) {

        int[] array = {4,-5,3,-2,76,11,52,-101,9,12};

        //find the biggest number
        int theBiggestNumber = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > theBiggestNumber){
                theBiggestNumber = array[i];
            }
        }
        System.out.println("The biggest number in array is: " + theBiggestNumber);

        //the sum of positive numbers in array
        int sumOfPositiveNumbers = 0;

        for (int i = 0; i < array.length; i++){
            if(array[i] > 0){
                sumOfPositiveNumbers+=array[i];
            }
        }
        System.out.println("Sum of positive numbers is: " + sumOfPositiveNumbers);

        //the amount of negative numbers in array and amount of positive numbers
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
