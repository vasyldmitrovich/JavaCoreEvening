package com.softserve.edu10.MyProjects.Homework1;

import java.util.*;

public class ClassSet {

    public ClassSet() {}

    public boolean union(Set set1, Set set2) {
        return set1.addAll(set2);
    }

    public boolean intersect(Set set1, Set set2) {
        return set1.retainAll(set2);
    }


}
