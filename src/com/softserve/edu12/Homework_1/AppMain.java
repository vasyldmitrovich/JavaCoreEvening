package com.softserve.edu12.Homework_1;

public class AppMain {
    public static void main(String[] args) {

//        1
//        System.out.println(new Methods().div(2, 0));

        // 2
        try {
            new Methods().div(2, 0);
        } catch (MyArithmeticException myArithmeticException) {
            System.err.println(myArithmeticException.getMessage());
        }
    }
}
