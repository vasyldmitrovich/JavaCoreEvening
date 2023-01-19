package com.softserve.edu12.MyProjects.PracticalTask1;

import java.io.IOException;

/* Romna Sitko
* Lesson 12. Practical task 1*/
public class Main {
    public static void main(String[] args) {

    }

    public void run() {
        int a = 0, b = 0;
        CalcArea calcArea = new CalcArea();
        //a = calcArea.inputValues();
        //b = calcArea.inputValues();
        try {
            calcArea.squareRectangle(a, b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
