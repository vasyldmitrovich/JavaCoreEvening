package com.softserve.edu12.PracticalTask.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.softserve.edu12.PracticalTask.Task1.Rectangle.rectangle;

public class main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        run();
    }

    public static void run(){
        rectangle();



    }
    public static int squareRectangle(int a, int b) throws NegativeNumExcep {
        if (a < 0 || b < 0) throw new NegativeNumExcep("Від*ємне значення неприпустиме");
        return a * b;
    }
}
