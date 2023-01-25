package com.softserve.graduation;

import com.softserve.service.MyScanner;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        play();
    }

    public static void play() {
        System.out.println("Let's play Rock-paper-scissors");

        String name = MyScanner.writeInputStringInLine("Enter your name: ");
        System.out.println("Hello, " + name);

        HashMap<String, Integer> mapRating = readRating();

        int rating = 0;
        if (mapRating.containsKey(name)) {
            rating = mapRating.get(name);
        }

        rating = playing(rating);

        mapRating.put(name, rating);

        writeRating(mapRating);
    }

    public static int inputChoice() {
        try {
            return MyScanner.writeInputInt("\nInput your choice: 1-rock, 2-paper, 3-scissors, 4-rating, 5-exit");
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static int playing(int rating) {
        boolean run = true;

        while (run) {
            int choice = inputChoice();

            Random random = new Random();
            int choiceComputer = random.nextInt(3) + 1;

            String option = "";
            switch (choiceComputer) {
                case 1:
                    option = "rock";
                    break;
                case 2:
                    option = "paper";
                    break;
                case 3:
                    option = "scissors";
                    break;
            }

            if (choice < 1 | choice > 5) {
                System.out.println("Incorrect value\n");
            } else if (choice == 5) {
                run = false;

                System.out.println("Bye!");
            } else if (choice == 4) {
                System.out.println("Your rating: " + rating);
            } else if (choice == choiceComputer) {
                rating = rating + 50;
                System.out.printf("There is a draw (%s)\n", option);
            } else if ((choice == 1 & choiceComputer == 2)
                    | (choice == 2 & choiceComputer == 3)
                    | (choice == 3 & choiceComputer == 1)) {
                System.out.printf("Sorry, but the computer chose %s\n", option);
            } else {
                rating = rating + 100;
                System.out.printf("Well done. The computer chose %s and failed\n", option);
            }
        }

        return rating;
    }

    public static HashMap<String, Integer> readRating() {
        HashMap<String, Integer> mapRating = new HashMap<>();
        String fileName = "D:/Users/Лукьяненко/java/rating.txt";

        Pattern pattern = Pattern.compile("\\b\\d+");
        Matcher m;

        try {
            String s = null;
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((s = br.readLine()) != null) {
                m = pattern.matcher(s);
                if (m.find()) {
                    mapRating.put(s.substring(0, m.start() - 1),
                            Integer.parseInt(s.substring(m.start(), m.end())));
                }
            }
        } catch (FileNotFoundException exception) {
            //System.out.println("File with rating not found");
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        return mapRating;
    }

    public static void writeRating(HashMap<String, Integer> mapRating) {
        String fileName = "D:/Users/Лукьяненко/java/rating.txt";

        try {
            FileWriter fw = new FileWriter(fileName);

            for (Map.Entry m : mapRating.entrySet()) {
                fw.write(m.getKey() + " " + m.getValue()+"\n");
            }

            fw.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
