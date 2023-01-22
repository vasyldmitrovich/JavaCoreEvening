package com.softserve.edu10.Homework.Homework_1;

import java.util.Set;

public class Methods {

    public Set<Object> union(Set<Object> set1, Set<Object> set2) {
        set1.addAll(set2);
        return set1;
    }

    public Set<Object> intersection(Set<Object> set1, Set<Object> set2) {
        set1.retainAll(set2);
        return set1;
    }
}
