package com.softserve.edu13.PracticalTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void SortingSomething(){
        List<String> strings = createStringList();

        strings.sort((str1,str2) -> +str1.compareTo(str2));
        System.out.println("Пряме сортування: " + strings);
        strings.sort((str1,str2) -> -str1.compareTo(str2));
        System.out.println("Зворотнє сортування: " + strings);
    }

    public static List<String> createStringList(){
        return new ArrayList<>(Arrays.asList("Hannah", "Olga", "Sergiy", "Hope" ,"Ketty", "Vanda"));
    }
}
