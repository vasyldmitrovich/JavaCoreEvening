package com.softserve.Tasks;

public class Task5 {

    //5. Input string and check if this string is palindrome (e.g. “ABCCBA”)

    public static boolean isPalindrome(String string) {
        string = string.toLowerCase().replaceAll(" ", "");
        int i1 = 0;
        int i2 = string.length() - 1;
        while (i2 > i1) {
            if (string.charAt(i1) != string.charAt(i2)) {
                System.out.println("false");
                return false;
            }
            ++i1;
            --i2;
        }

        System.out.println("true");
        return true;
    }
}
