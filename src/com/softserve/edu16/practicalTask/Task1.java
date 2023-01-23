package com.softserve.edu16.practicalTask;

import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException e) {
            System.out.println("Problem with file reading");
        }
    }

    public static void run() throws IOException {
        File file = new File("src\\com\\softserve\\edu16\\practicalTask\\myfile.txt");

        String str;

        BufferedReader bf = new BufferedReader(new FileReader(file));
        List<String> listOfStrings = new ArrayList<>();
        while ((str = bf.readLine()) != null) {
            if (!str.isEmpty()) {
                listOfStrings.add(str);
            }
        }
        bf.close();

        Map<String, Integer> map = countNumberOfSymbolsInEveryLine(listOfStrings);
        System.out.println("Count of symbols in each line: ");
        System.out.println(map);
        var longestString = getLongestString(map);
        System.out.println("\nLongest string: " + longestString);
        var shortestString = getShortestString(map);
        System.out.println("Shortest string: " + shortestString);
        System.out.println("\nStrings which contains var:");
        printStringsWhichContainsVar(listOfStrings);
    }
    public static Map<String,Integer> countNumberOfSymbolsInEveryLine(List<String> strings){
        return strings.stream().collect(Collectors.toMap(Function.identity(),String::length));
    }

    public static Map.Entry<String, Integer> getLongestString(Map<String, Integer> strings){
        return strings.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get();
    }

    public static Map.Entry<String, Integer> getShortestString(Map<String, Integer> strings){
        return strings.entrySet().stream().min(Comparator.comparing(Map.Entry::getValue)).get();
    }

    public static void printStringsWhichContainsVar(List<String> strings){
        strings.stream().filter(s -> s.contains("var")).forEach(System.out::println);
    }
}
