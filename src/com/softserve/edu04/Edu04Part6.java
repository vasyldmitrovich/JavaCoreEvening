package com.softserve.edu04;

import java.util.Scanner;

/**
 * HOMEWORK
 * read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
 */
public class Edu04Part6 {

    public static void main(String[] args) {
        int numberError = numberError();
        for (HTTPError httpError : HTTPError.values()) {
            if (httpError.getNumberError() == numberError) {
                System.out.println(httpError);
            }
        }
    }

    static public int numberError() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of error");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter right first number");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
