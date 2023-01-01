package com.softserve.edu11.practicalTask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        verifyUsernames(createUserNames());
    }

    public static String[] createUserNames(){
        return new String[]{"123","v_siver1214","vps1242_32t","","VladyslavSiverskiy123"};
    }

    public static void verifyUsernames(String[] userNames){
        for (String userName: userNames){
            // length from 3 to 15,
            // allow numbers, letters of latin, underscores;
            Pattern pattern = Pattern.compile("(\\w){3,15}");
            Matcher matcher = pattern.matcher(userName);

            //regex to check if username contains at least one letter
            Pattern containsAtLeastOneLetter = Pattern.compile("([A-Za-z])+");
            Matcher matcher2 = containsAtLeastOneLetter.matcher(userName);

            //print result
            System.out.println(userName + " matches? " + (matcher.matches() && matcher2.find()));
        }
    }
}
