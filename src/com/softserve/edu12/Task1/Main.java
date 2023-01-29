package com.softserve.edu12.Task1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.softserve.edu12.Task1.Rectangle.rectangle;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        run();
    }

    public static void run(){
        rectangle();



    }
    public static int squareRectangle(int a, int b) throws NegativeNumber {
        if (a < 0 || b < 0) throw new NegativeNumber("A negative value is unacceptable!");
        return a * b;
    }
}
