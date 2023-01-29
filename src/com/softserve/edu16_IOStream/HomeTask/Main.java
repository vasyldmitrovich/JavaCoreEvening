package com.softserve.edu16_IOStream.HomeTask;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main implements AutoCloseable{
    public static void main(String[] args) {
        go();
    }

    public static void go(){
        doFirstTask();

        doSecondTask();
    }

    public static void doFirstTask(){

        List<String> arrayStrings = readFile();

        writeFile(arrayStrings);

        System.out.println("Task done");
    }

    public static List<String> readFile(){
        List<String> arrayStrings = new ArrayList<>();
        String fileName = "D:/Users/Лукьяненко/java/file1.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String s = null;

            while ((s= br.readLine()) != null){
                arrayStrings.add(s);
            }
        }
        catch (FileNotFoundException exception){
            System.out.println(exception.getMessage());
        }
        catch (IOException exception){
            System.out.println(exception.getMessage());
        }

        return arrayStrings;
    }

    public static void writeFile(List<String> arrayStrings) {
        String fileName = "D:/Users/Лукьяненко/java/file2.txt";

        try (FileWriter fw = new FileWriter(fileName)){
            fw.write("Numbers of line: "+arrayStrings.size()+"\n");

            String longestString = findLongestLine(arrayStrings);
            fw.write("Longest string: "+longestString+"\n");

            List<String> newArrayStrings = arrayStrings.stream()
                    .filter(s->(s.startsWith("Name") | s.startsWith("Birthday")))
                    .toList();

            for (String s:newArrayStrings
                 ) {
                fw.write(s+"\n");
            }
        }
        catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
    public static String findLongestLine(List<String> arrayStrings){
        int maxLength = 0;
        String maxString="";

        for (String s: arrayStrings
             ) {
            if (s.length()>maxLength){
                maxLength = s.length();
                maxString = s;
            }
        }

        return maxString;
    }

    @Override
    public void close() throws Exception {

    }

    public static void doSecondTask(){
        String fileNameRead = "D:/Users/Лукьяненко/java/filePublic.txt";
        String fileNameWrite = "D:/Users/Лукьяненко/java/filePrivate.txt";

        try (FileWriter fw = new FileWriter(fileNameWrite)){
            BufferedReader br = new BufferedReader(new FileReader(fileNameRead));
            String s = null;
            while ((s=br.readLine())!=null){
                s = s.replaceAll("public","private");
                fw.write(s+"\n");
            }
        }
        catch (FileNotFoundException exception){
            System.out.println(exception.getMessage());
        }
        catch (IOException exception){
            System.out.println(exception.getMessage());
        }

        System.out.println("Task second done");
    }
}
