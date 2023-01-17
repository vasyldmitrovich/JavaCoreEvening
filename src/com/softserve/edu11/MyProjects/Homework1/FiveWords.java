package com.softserve.edu11.MyProjects.Homework1;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FiveWords {

    public static void biggestWord(String text) {
        String pattern = "[a-zA-Z]+";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        // 2. Get all parts
        m.reset(); // Reset Iterator

//        Map<Integer, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        while (m.find()) {
//            System.out.println(" *" + text.substring(m.start(), m.end()).length() + "* ");
//            map.put(text.substring(m.start(), m.end()).length(), text.substring(m.start(), m.end()));
            list.add(text.substring(m.start(), m.end()));
            list1.add(text.substring(m.start(), m.end()).length());

        }
        int maxKey = 0; // Collections.max(map.keySet());
//        System.out.println(map.get(maxKey) + " - number of letters " + maxKey);

        maxKey = list1.indexOf(Collections.max(list1));
        System.out.println(list.get(maxKey) + " - number of letters " + Collections.max(list1));

    }
}
