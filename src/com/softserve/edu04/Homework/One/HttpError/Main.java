package com.softserve.edu04.Homework.One.HttpError;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HTTPError httpError = HTTPError.Forbidden;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();
        System.out.println(httpError.meaning(a));
    }
}
