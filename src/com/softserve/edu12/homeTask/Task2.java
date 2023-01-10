package com.softserve.edu12.homeTask;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            run();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void run() throws Exception{
        int counter = 0;
        int startOfTheRange = 0;
        int endOfTheRange = 100;
        while (counter < 10){
            System.out.println("Enter the number in the range of ("+ startOfTheRange + "," + endOfTheRange + ")");
            int numberIn  = readNumber(startOfTheRange,endOfTheRange);
            System.out.println("You`ve entered " + numberIn);
            startOfTheRange = numberIn;
            counter++;
        }
    }

    public static int readNumber(int start, int end) throws Exception{
        int number;
        Scanner sc = new Scanner(System.in);
        try {
            number = sc.nextInt();
            if(number > start && number < end){
                return number;
            }else {
                throw new InputMismatchException("You`ve enter number out of the range");
            }
        }catch (InputMismatchException e){
            throw new InputMismatchException(e.getMessage());
        }catch (Exception e){
            throw new Exception();
        }
    }
}
