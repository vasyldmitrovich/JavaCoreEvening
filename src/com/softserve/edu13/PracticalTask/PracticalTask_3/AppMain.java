package com.softserve.edu13.PracticalTask.PracticalTask_3;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        System.out.println(list);
        new Methods().sortingList(list);
        System.out.println(list);
    }
}
