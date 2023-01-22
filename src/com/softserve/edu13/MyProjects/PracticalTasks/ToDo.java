package com.softserve.edu13.MyProjects.PracticalTasks;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ToDo {

    public static List<String> sortList(List<String> list) {
        List<String> list1 = list.stream().sorted().collect(Collectors.toList());
        return list1;
    }

    public static int count(List<Integer> a, Predicate<Integer> predicate) {
/*
//      First method
        int c = 0;
        for(Integer i : a) {
            if(predicate.test(i)) {
                c++;
            }
        }
        System.out.println(c);
*/

//        Second method
        return (int)a.stream().filter(predicate).count();
    }

}
