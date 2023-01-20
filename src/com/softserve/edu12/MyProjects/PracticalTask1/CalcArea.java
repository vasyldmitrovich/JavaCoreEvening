package com.softserve.edu12.MyProjects.PracticalTask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcArea {

    private int area;
    int value;

    public CalcArea() {
        area = 0;
        value = 0;
    }

    public int squareRectangle(int a, int b) throws IOException {
        if (a < 0 || b < 0) {
            throw new IOException("Error. Some value is negative!!!");
        }
        area = a * b;
        return area;
    }

    public int getArea() {
        return area;
    }

    public int inputValues()  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter value: ");
        try {
            value = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Input error. Wrong value. Should be integer");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Input error. Some exception");
            e.printStackTrace();
            System.exit(0);
        }
        return value;
    }
}