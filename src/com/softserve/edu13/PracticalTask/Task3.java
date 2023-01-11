package com.softserve.edu13.PracticalTask;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        run();

    }

    public static void run(){
        List<String> list = declareList();
        list.sort((s1, s2) -> s1.compareTo(s2));
        list.forEach(System.out::println);
    }

    public static List <String> declareList(){
        List<String> myCollection = new ArrayList<>();
        myCollection.add("s");
        myCollection.add("a");
        myCollection.add("b");
        myCollection.add("p");
        return myCollection;
    }

}
