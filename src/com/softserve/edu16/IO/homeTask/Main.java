package com.softserve.edu16.IO.homeTask;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        firstTask();
        secondTask();
    }

    static void firstTask() throws IOException {
        File file = new File("C:\\infa\\GitRepos\\JavaCore\\src\\com\\softserve\\edu16\\IO\\homeTask\\file1.txt");
        File file1 = new File("C:\\infa\\GitRepos\\JavaCore\\src\\com\\softserve\\edu16\\IO\\homeTask\\file2.txt");
        String maxLine = "";
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));

        while (bufferedReader.ready()) {
            list.add(bufferedReader.readLine());
        }
        System.out.println(list);

        for (String line : list) {
            if (line.length() > maxLine.length()) maxLine = line;
        }


        bufferedWriter.write(list.size() + "\n");
        bufferedWriter.write(maxLine + "\n");
        bufferedWriter.write("Anisimov Eugene" + "\n");
        bufferedWriter.close();
        bufferedReader.close();
    }

    static void secondTask() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\infa\\GitRepos\\JavaCore\\src\\com\\softserve\\edu16\\IO\\homeTask\\fileCode.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\infa\\GitRepos\\JavaCore\\src\\com\\softserve\\edu16\\IO\\homeTask\\newFileCode.txt"));
       while (bufferedReader.ready()){
            bufferedWriter.write(bufferedReader.readLine().replace("public", "private")+"\n");
       }
       bufferedReader.close();
       bufferedWriter.close();



    }


}
