package com.softserve.edu05.HomeTasks5;

import java.util.Scanner;

public class HomeTask5 {
    static int[] arrayDays ={31,28,31,30,31,30,31,31,30,31,30,31};

    static int findQuantityDays(int i){
        return arrayDays[i-1];
    }

    static int[] readArray(int lenght){
        int[] array = new int[lenght];

        System.out.println("Input " +lenght+ " numbers");
        for (int i = 0; i < lenght; i++) {
            array[i] = myScanner.scan.nextInt();
        }
        return array;
    }

    static void resolveFirstTask(){
        System.out.println("Input number of month");
        int i = myScanner.scan.nextInt();

        int qDays = HomeTask5.findQuantityDays(i);

        System.out.println("There are "+qDays+" days in "+i +" month");
    }

    static void resolveSecondTask(){
        int[] arraySecond = readArray(10);

        boolean allPositive = true;

        for (int i = 0; i < 5; i++) {
            if (arraySecond[i]<0){
                allPositive = false;
                break;
            }
        }

        int result;
        if (allPositive) {
            result = 0;
            for (int i = 0; i < 5; i++) {
                result+=arraySecond[i];
            }
            System.out.println("Sum first five numbers is "+ result);
        }
        else {
            result = 1;
            for (int i = 5; i < 10; i++) {
                result*=arraySecond[i];
            }
            System.out.println("Product last five numbers is "+ result);
        }
    }

    static void findPositionPositiveNumber(int[] arrayThird, int num){
        int j = 0, i =0;
        int ipos=0;
        do {
            if (arrayThird[i]>0) {
                j++;
                ipos = i;
            }
            i++;
        }while (j<num && i < arrayThird.length);

        if (j==num) {
            System.out.println("Position of second positive number is "+(ipos+1));
        } else {
            System.out.println("There isn't second positive number");
        }
    }

    static void findMinimum(int[] array){

       int min=array[0];
       int pos=0;

        for (int i = 1; i < array.length; i++) {
            if (array[i]<min) {
                min = array[i];
                pos = i;
            }
        }

        System.out.println("Minimum is "+min+". It position is "+(pos+1));
    }

    static void countProductEvenNumbers(int[] array){
        int product=1;
        for (int element: array) {
            if (element%2==0){
                product*=element;
            }
        }

        System.out.println("Product even numbers is "+product);
    }
    static void resolveThirdTask(){
        int[] arrayThird = readArray(5);

        findPositionPositiveNumber(arrayThird, 2);

        findMinimum(arrayThird);

        countProductEvenNumbers(arrayThird);
    }

    static void resolveFourthTask(){
        Car car1 = new Car(Models.AUDI, 2015, 1.2);
        Car car2 = new Car(Models.FORD, 2020, 0.8 );
        Car car3 = new Car(Models.NISSAN, 2015, 1);
        Car car4 = new Car(Models.HONDA, 2018, 2);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());

        System.out.println("Input year");
        int year;
        year = myScanner.scan.nextInt();

        Car.belongYear(year, car1, car2, car3, car4);

        System.out.println();
        Car.orderCarsByYear(car1, car2, car3, car4);
    }
}
