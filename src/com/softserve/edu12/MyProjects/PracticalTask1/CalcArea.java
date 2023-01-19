package com.softserve.edu12.MyProjects.PracticalTask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcArea {

    private int area;

    public CalcArea() {
        area = 0;
    }

    public int squareRectangle(int a, int b) throws IOException {
        if (a < 0 || b < 0) {
            throw new IOException("negative!!!");
        }
        area = a * b;
        return area;
    }

    public int inputValues() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(br.readLine());
        return value;
    }
}
