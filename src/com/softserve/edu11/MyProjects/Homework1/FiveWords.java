package com.softserve.edu11.MyProjects.Homework1;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FiveWords {

    public static void biggestWord(String text) {
        String pattern = "[a-zA-Z]+";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        m.reset(); // Reset Iterator

//       Map<Integer, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        while (m.find()) {
            list.add(text.substring(m.start(), m.end()));
            list1.add(text.substring(m.start(), m.end()).length());

        }
        int maxKey = 0;

        //bring the second word in reverse order
        char[] arrayOfSecondWord = list.get(1).toCharArray();
        StringBuilder secondWord = new StringBuilder();
        for (int i = arrayOfSecondWord.length - 1; i >= 0; i--) {
            secondWord.append(arrayOfSecondWord[i]);
        }

        //display the longest word in the sentence
        //determine the number of its letters
        maxKey = list1.indexOf(Collections.max(list1));
        System.out.println(text + "\n" + list.get(maxKey) + ": number of letters " +
                Collections.max(list1) + ". Reverse second word: " + secondWord + "\n");

    }
}
