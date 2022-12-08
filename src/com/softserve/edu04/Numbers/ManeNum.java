package com.softserve.edu04.Numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManeNum {
    int Num1, Num2, Num3;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть три числа:");

        int Num1 = Integer.parseInt(br.readLine());
        int Num2 = Integer.parseInt(br.readLine());
        int Num3 = Integer.parseInt(br.readLine());


        if (Num1 % 2 == 0) {
            System.out.println("Number " + Num1 + " is odd");
        }
         if (Num1 % 2 != 0) {
             System.out.println("Number " + Num1 + " is  not odd");
         }
        if (Num2 % 2 == 0) {
            System.out.println("Number " + Num2 + " is odd");
        }
         if (Num1 % 2 != 0) {
        System.out.println("Number " + Num2 + " is  not odd");
            }
            if (Num3 % 2 == 0) {
                System.out.println("Number " + Num3 + " is odd");
            }
        if (Num1 % 2 != 0) {
        System.out.println("Number " + Num3 + " is  not odd");
        }


    }


}
