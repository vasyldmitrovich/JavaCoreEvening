package com.softserve.edu12_Exсeptions.HomeTasks;

import com.softserve.service.MyExceptions;
import com.softserve.service.MyScanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main implements AutoCloseable{
    public static void main(String[] args) {
        go();
    }

    public static void go(){

      dividingDoubleNumbers();

      System.out.println();
      outputSequenceOfNumbers();

    }

    public static void dividingDoubleNumbers(){
        try {
            double a = MyScanner.writeInputDouble("Input double number a");
            double b = MyScanner.writeInputDouble("Input double number b");

            System.out.println("a/b = "+ div(a,b));
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Nonnumeric value");
        }

    }
    public static double div (double a, double b) throws RuntimeException{
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a/b;

    }

    public static void outputSequenceOfNumbers(){
        int[] arrayNumbers = new int[10];

        for (int i = 0; i < 10;) {
            try {
                int a = readNumber(1,100);
                arrayNumbers[i] = a;
                i++;
            }
            catch (MyExceptions e){
                System.out.println(e.getMessage());
            }
            catch (NumberFormatException|IOException e) {
                System.out.println(e.getMessage());
            }
        }

        Arrays.sort(arrayNumbers);

        System.out.print("1<");
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.print(arrayNumbers[i]+"<");
        }
        System.out.print("100");
    }

    public static int readNumber(int start, int end) throws MyExceptions, IOException {
        try {
            System.out.println("Input int number");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(br.readLine());
            if (a >= start & a <= end) {
                return a;
            } else {
                throw new MyExceptions("Invalid valid");
            }
        }
        catch (NumberFormatException|IOException e){
                throw e;
            }
    }

    @Override
    public void close() throws Exception {

    }
}
