package com.softserve.edu11.PratcicalTask;

import java.io.IOException;

public class AppMain {
    public static void main(String[] args) throws IOException {

        String o1 = "IT";
        String o2 = "IT Academy";
        System.out.println("Result 1 task:\n" + new Methods().ifIsASubstring(o1, o2));
        System.out.println();
        new Methods().outPut();
        System.out.println();
        new Methods().nameChecking();

    }
}
