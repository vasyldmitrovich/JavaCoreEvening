package com.softserve.MyFinalProject;

public class Main {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        String str1 = "abc.as";
        char[] chStr = str.toCharArray();
        char[] chStr1 = str1.toCharArray();

        StringBuilder sb = new StringBuilder();
//        System.out.println(chStr[15]);

        for(int i = 0; i < chStr1.length; i++) {
            for(int j = 0; j < 26; j++) {
                if (chStr[j] == chStr[i]) {
                    sb.append(chStr[j + 2]);
                } else {
                    sb.append(" ");
                    j = 26;
                }
            }
        }

        System.out.println(sb);
    }
}
