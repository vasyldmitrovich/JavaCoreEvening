package com.softserve.edu12.Homework.Homework_1;

public class Methods {

    public double div(double a, double b) {
        if (a == 0 || b == 0) throw new MyArithmeticException("You can't divide by zero. Try again.", "111");
        return a / b;
    }
}
