package com.softserve.edu11.MyProjects.Homework1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FiveWords {

    public static void biggestWord(String text) {
        String pattern = "[a-zA-Z]+";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        // 2. Get all parts
        m.reset(); // Reset Iterator

        Map<Integer, String> map = new HashMap<>();
        while (m.find()) {
//            System.out.println(" *" + text.substring(m.start(), m.end()).length() + "* ");
            map.put(text.substring(m.start(), m.end()).length(), text.substring(m.start(), m.end()));
        }
        int maxKey = Collections.max(map.keySet());
        System.out.println(map.get(maxKey) + " - number of letters " + maxKey);
    }
}
