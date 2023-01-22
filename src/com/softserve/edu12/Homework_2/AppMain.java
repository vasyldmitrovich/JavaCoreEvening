package com.softserve.edu12.Homework_2;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) throws MyException {

        List<Integer> list = new ArrayList<>();
        int start;
        int end;
        try {
            System.out.println("Enter start range:");
            start = new Methods().integer();
        } catch (MyException myException) {
            start = Integer.MIN_VALUE;
        }
        try {
            System.out.println("Enter end range:");
            end = new Methods().integer();
        } catch (MyException myException) {
            end = Integer.MAX_VALUE;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter integer #" + (i + 1));
            try {
                int integer = new Methods().readNumber(start, end);
                list.add(integer);
            } catch (MyException myException) {
                System.err.println("Exception: [ " + myException.getMessage()
                        + " ] , exception code: [ " + myException.getErrorCode() + " ]");
                list.add(null);
            }
        }
        System.out.println(list);
        //new Methods().readNumber(23, 73);
        //System.out.println(new Methods().checkNumber("111"));
    }
}
