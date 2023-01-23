package com.softserve.edu13.Homework.Homework_1;

import java.util.function.Predicate;

public class Methods {

    public String encrypt(String s, int n) {
        Predicate<Integer> p = e -> e > 64 & e < 91 || e > 96 & e < 123;
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if (p.test((int) arr[i])) {
                if (p.test((int) arr[i] + n)) {
                    arr[i] += n;
                } else {
                    arr[i] += n - 26;
                }
            }
        }
        return String.valueOf(arr);
    }

    public String decrypt(String s, int n) {
        Predicate<Integer> p = e -> e > 64 & e < 91 || e > 96 & e < 123;
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if (p.test((int) arr[i])) {
                if (p.test((int) arr[i] - n)) {
                    arr[i] -= n;
                } else {
                    arr[i] -= n - 26;
                }
            }
        }
        return String.valueOf(arr);
    }
}
