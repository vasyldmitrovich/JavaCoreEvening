package com.softserve.edu04.Homework.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//read number of HTTP Error (400, 401,402, ...) and write the name of this error

public class MainError {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of HTTP Error:");
        int errorNumber = Integer.parseInt(br.readLine());

        switch (errorNumber) {
            case 400 -> System.out.println("Means: " + HTTPError.FOUR_ZERO_ZERO.getError());
            case 502 -> System.out.println("Means: " + HTTPError.FIVE_ZERO_TWO.getError());
            case 503 -> System.out.println("Means: " + HTTPError.FIVE_ZERO_THREE.getError());
            case 504 -> System.out.println("Means: " + HTTPError.FIVE_ZERO_FOUR.getError());
            case 401 -> System.out.println("Means: " + HTTPError.FOUR_ZERO_ONE.getError());
            case 403 -> System.out.println("Means: " + HTTPError.FOUR_ZERO_THREE.getError());
            case 404 -> System.out.println("Means: " + HTTPError.FOUR_ZERO_FOUR.getError());
            case 500 -> System.out.println("Means: " + HTTPError.FIVE_ZERO_ZERO.getError());
            default -> System.out.println("Sorry, there is no such number of HTTP Error in the list.");
        }
    }
}
