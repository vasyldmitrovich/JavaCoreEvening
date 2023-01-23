package com.softserve.edu13.PracticalTask.PracticalTask_3;

import java.util.List;

public class Methods {

    public List<String> sortingList(List<String> list) {
        list.sort(String::compareTo);
        return list;
    }
}
