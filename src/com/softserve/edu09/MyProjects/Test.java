package com.softserve.edu09.MyProjects;


import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");

//        System.out.println(map);
//        System.out.println(map.containsKey(
////    }4));
//        System.out.println(map.remove(2));
//        System.out.println(map);

        Map<S, String> m = new HashMap<>();
        m.put(new S("O"), "Java");
        m.put(new S("O"), "Python");
        System.out.println(m);
    }
}

class S {
    private String n;
    public S(String n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return n;
    }
}
