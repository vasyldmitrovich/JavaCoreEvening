package com.softserve.edu12.PracticalTask.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.softserve.edu12.PracticalTask.Task1.main.squareRectangle;

public class Rectangle {
    public static void rectangle(){
    int a = 0;
    int b = 0;



        try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть значення a:");
        a = scanner.nextInt();
        System.out.println("Введіть значення b:");
        b = scanner.nextInt();
    }
        catch (
    InputMismatchException e) {
        System.out.println("Введіть ЦИФРОВЕ значення");
    }


        try {
        int square = squareRectangle(a,b);
        System.out.println(square);
    } catch (NegativeNumExcep e) {
        System.out.println(e.getMessage());
    }
}


}


