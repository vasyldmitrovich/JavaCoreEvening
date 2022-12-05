package com.softserve.edu01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class edu01Part2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How are you");
        String answer = reader.readLine();
        System.out.println("You are "+ answer);
    }
}
