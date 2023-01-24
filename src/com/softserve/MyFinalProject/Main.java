package com.softserve.MyFinalProject;

import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        String str2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str1 = "Hello";

        char[] chStr = str.toCharArray();
        char[] chStr1 = str1.toCharArray();
        char[] chStr2 = str2.toCharArray();

        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>();

        for(int i = 0; i < 26; i++) {
            for(int j = 0; j < chStr1.length; j++) {
                if (chStr1[j] == chStr[i]) {
                    list.add(chStr[i + 2]);
                }
                if (chStr1[j] == chStr2[i]) {
                    list.add(chStr2[i + 2]);
                }
            }
        }

//        for(int i = 0; i < 26; i++) {
//            for(int j = 0; j < chStr1.length; j++) {
//                if ((chStr1[j] == chStr2[i]) && (Character.isUpperCase(chStr1[j]))) {
//                    list.add(j, chStr2[i + 2]);
//                }
//            }
//        }

        for (int i = 0; i < chStr1.length; i++) {
            if(!Character.isLetter(chStr1[i])){
                list.add(i, chStr1[i]);
            }
        }




        for(Character c : list) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}
