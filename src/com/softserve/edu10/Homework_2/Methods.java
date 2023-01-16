package com.softserve.edu10.Homework_2;

import java.util.*;

public class Methods {

    public int equalsLastName(Map<String, String> personMap) {
        int count = 1;
        Set<String> set = new HashSet<>();
        for (String s : personMap.values()) {
            if (!set.add(s)) {
                count++;
            }
        }
        return count <= 1 ? 0 : count;
    }

    public void removeLastName(Map<String, String> map, String s) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (s.equals(entry.getValue())) {
                iterator.remove();
            }
        }
    }
}
