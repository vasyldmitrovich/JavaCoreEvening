package com.softserve.edu09.MyProjects;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");

        System.out.println(map);
        System.out.println(map.containsKey(4));
        System.out.println(map.remove(2));
        System.out.println(map);

    }
}
