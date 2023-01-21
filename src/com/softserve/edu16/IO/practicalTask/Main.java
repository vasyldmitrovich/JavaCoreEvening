package com.softserve.edu16.IO.practicalTask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        firstTask();
        secondTask();
    }

    static void firstTask() throws IOException {
        int max = Integer.MIN_VALUE;
        String maxLine = "";
        ArrayList<String> lines = new ArrayList<>();


        File file = new File("src/com/softserve/edu16/IO/practicalTask/mytext.txt");
        System.out.println("File exists - " + file.exists());

        ArrayList<String> linesFiles = new ArrayList<>(Files.readAllLines(file.toPath()));
        System.out.println(linesFiles + "       Files");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        while (bufferedReader.ready()) {
            lines.add(bufferedReader.readLine());
        }

        bufferedReader.close();
        System.out.println(lines + "       Buffer");
        for (String line : lines) {
            if (line.length() > max) {
                max = line.length();
                maxLine = line;
            }
            System.out.println("Line - '" + line + "' has length - " + line.length());
        }
        System.out.println("The longest line is '" + maxLine + "' with length - " + max);

        for (String line : lines) {
            if (line.toLowerCase().contains("var")) {
                System.out.println(line + " Contains \"var\"");
            }
        }
    }

    static void secondTask() throws IOException {
        System.out.println("_".repeat(80));

        File file = new File("C:\\infa\\GitRepos\\JavaCore\\src\\com\\softserve\\edu16\\IO\\practicalTask\\text.txt");
        ArrayList<String> list = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        Scanner scan = new Scanner(fileReader);

        while (scan.hasNext()) {
            list.add(scan.next());
        }

        Pattern pattern = Pattern.compile("^[iouae]\\w+");

        for (String line : list) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.matches()) {
                System.out.println(line);
            }
        }

        System.out.println("_".repeat(80));

        for (int i = 0; i < list.size() - 1; i++) {
            String first = list.get(i);
            String second = list.get(i + 1);
            if (second.startsWith(String.valueOf(first.charAt(first.length() - 1)))) {
                System.out.println(first + " " + second);
            }
        }
        scan.close();

    }
}
