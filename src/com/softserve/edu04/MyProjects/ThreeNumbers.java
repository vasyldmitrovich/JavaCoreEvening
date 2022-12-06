package com.softserve.edu04.MyProjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three numbers");
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());

        if (num1 % 2 == 0) {}

        System.out.println(num1 + num2 + num3);

    }
}
