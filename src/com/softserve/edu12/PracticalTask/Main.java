package com.softserve.edu12.PracticalTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        int a, b, area;
       try {
        System.out.print("Input first side: ");
        a = input();
        System.out.print("Input second side: ");
        b = input();
        area = squareRectangle(a, b);
           System.out.println("Area: " + area);
       }
       catch (IllegalArgumentException e){
           System.out.println(e.getMessage());
       }
    }


   public static int squareRectangle (int a, int b) throws IllegalArgumentException{
           if (a <= 0 || b <= 0) {
               throw new IllegalArgumentException("Negative value");
           }
       return a * b;
   }

    public static int input() {
        int n = 0;
        try {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter number");
        }
        return n;
    }
}
