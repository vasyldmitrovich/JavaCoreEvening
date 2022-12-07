package com.softserve.edu04.homeTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FirstTask {
    public static boolean checkFloat() {
        System.out.println("Input 3 float numbers");

        Scanner scan = new Scanner(System.in);
        ArrayList<Float> arr = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            arr.add(scan.nextFloat());
        }

        for (float num : arr) if (num < -5 || num > 5) return false;
        return true;
    }

    public static void minMax() {
        System.out.println("Input 3 numbers");

        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            arr.add(scan.nextInt());
        }

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Min value -> " + min + " Max value -> " + max);
    }

    public static void errorCheck() {
        System.out.println("Input number of the error");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        ArrayList<Errors> Arr = new ArrayList<>(Arrays.asList(Errors.values()));
        System.out.println(Errors.valueOf(String.valueOf(Arr.get(num % 400))));
    }

    enum Errors {
        BAD_REQUEST(400), UNAUTHORIZED(401), PAYMENT_REQUIRED(402), FORBIDDEN(403), NOT_FOUND(404), METHOD_NOT_ALLOWED(405), NOT_ACCEPTABLE(406), PROXY_AUTHENTICATION_REQUIRED(407), REQUEST_TIMEOUT(408);

        private int error;

        Errors(int error) {
        }

        public int getError() {
            return error;
        }
    }
}
