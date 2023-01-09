package com.softserve.edu12_Exсeptions.PracticalTasks;

import com.softserve.service.MyExceptions;
import com.softserve.service.MyScanner;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        go();
    }

    public static void go() {

        try{
            int a = MyScanner.writeInputInt("Input a");
            int b = MyScanner.writeInputInt("Input b");

            int res = squareRectangle(a, b);
            System.out.println("Square = "+res);
        }
        catch (MyExceptions e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Nonnumeriс value");
        }
    }

    public static int squareRectangle(int a, int b) throws MyExceptions{
        if (a<0|b<0){
            throw new MyExceptions("Negative value");
        }
        return a*b;
    }
}
