package com.softserve.edu12.Homework_2;

import java.util.Scanner;

public class Methods {

    public int integer() throws MyException {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        if (checkNumber(string)) {
            return Integer.parseInt(string);
        } else {
            throw new MyException("Is not a integer.", "104");
        }
    }

    public int readNumber(int start, int end) throws MyException{
        int a = integer();
        if (checkRange(start, end, a)) {
            return a;
        } else {
            throw new MyException("Integer is out of range", "666");
        }
    }

    public boolean checkRange(int start, int end, int a) {
        return a >= start && a <= end;
    }

    public boolean checkNumber(String string) {
        try {
            int anInt = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
    }
}
