package com.softserve.edu05.homeWork.SumNumber;

import java.util.Scanner;

public class SumFivePosNum {
    public static void addNumber(){
        int [] numArr = new int[10];
        int sum = 0;
        int sum1 = 0;
        int count = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Введіть десять цілих чисел:");

        for(int i = 0; i < 10; i++){
        numArr[i] = inp.nextInt();
        }

        for(int j = 0; j < 5; j++) {
            if (numArr[j] > 0) {
                sum += numArr[j];
                count++;
            }
        }

        if(count<5){
                for(int k = 5; k < 10; k++){sum1 += numArr[k];}
                System.out.println("Сума останніх п'яти чисел: " + sum1);
        }else{
                System.out.println("Сума перших п'яти чисел: " + sum);
        }
    }
}
