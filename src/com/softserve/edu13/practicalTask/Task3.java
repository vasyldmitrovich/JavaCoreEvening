package com.softserve.edu13.practicalTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        run();
    }

    public static void run(){
        List<String> strings = createStringList();
        strings.sort((str1,str2) -> str1.compareTo(str2));
        System.out.println("Sorting: " + strings);
        strings.sort((str1,str2) -> -str1.compareTo(str2));
        System.out.println("Reverse sorting: " + strings);
    }

    public static List<String> createStringList(){
        return new ArrayList<>(Arrays.asList("Hello", "Dog", "Wow", "Cat" ,"Andrew", "Book"));
    }
}
