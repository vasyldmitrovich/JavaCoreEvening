package com.softserve.edu12.MyProjects.PracticalTask1;

import java.io.IOException;

/* Roman Sitko
* Lesson 12. Practical task 1*/

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int a = 0, b = 0;
        CalcArea calcArea = new CalcArea();
        try {
            a = calcArea.inputValues();
            b = calcArea.inputValues();
            calcArea.squareRectangle(a, b);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Area: " + calcArea.getArea());
    }
}