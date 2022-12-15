package com.softserve.edu5.homeWork.NumPosition;

import java.util.Scanner;

public class TaskThird {
    static int [] numbArr = new int[5];
    private static int secondEl = 0;
    static int count = 0;
    static int min = 0;
    static int minPos = 0;

    public static void enterNumber(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Введіть п'ять цілих чисел: ");
        for (int i = 0; i < 5; i++){
        numbArr[i] = inp.nextInt();
        }
    }

    public static void printSecondPos(){
        for (int j = 0; j < 5; j++) {
            if (numbArr[j] >= 0 && count == 0) {
                ++count;
            }
            else if (numbArr[j] >= 0 && count == 1) {
                secondEl = numbArr[j];
                int position = j + 1;
                System.out.println("Друге додатнє ціле число: " + secondEl + ", його позиція : " + position);
                break;
            }
        }
    }

    public static void findMin() {
        for (int k = 0; k < 4; k++) {
            if (numbArr[k] < min) {
                min = numbArr[k];
                minPos = k + 1;
                }
            }
        System.out.println("Мінімальне значення: " + min + ", його позиція: " + minPos);
    }


    }

