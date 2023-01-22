package com.softserve.edu09;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class GetCollection {
    public static List<Integer> myList() {
        LinkedList<Integer> Collection = new LinkedList<>();
        Random random = new Random();
        for (int x = 0; x < 10; x++) {
            Collection.add(random.nextInt(75) - 10);
        }
        return Collection;
    }

}
