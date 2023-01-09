package com.softserve.edu12.practicalTask;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            squareRectangle();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        runPlant();

    }

    static int squareRectangle() throws Exception {
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a < 0 || b < 0) throw new Exception("Negative input");
        return a * b;
    }

    static void runPlant() {

        try {
            Plant plant = new Plant("shrub", "red", 2);
            System.out.println(plant);
            Plant plant1 = new Plant("shrubbbb", "red", 2);
        } catch (TypeException | ColorException e) {
            throw new RuntimeException(e);
        }
    }



}
