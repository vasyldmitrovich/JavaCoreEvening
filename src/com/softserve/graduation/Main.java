package com.softserve.graduation;

import com.softserve.service.MyScanner;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main implements AutoCloseable{
    public static void main(String[] args) {
        play();
    }

    public static void play() {

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

    public static List<String>  createArrayOptions(HashMap<String, List<String>> mapOptions){
        String optionsGame = MyScanner.writeInputString("Choose any options " +
                "(rock,gun,lightning,devil,dragon,water,air,paper,sponge,wolf,tree,human,snake,scissors,fire)");

        List<String> arrayOptions = new ArrayList<>();

        if (optionsGame.isEmpty()) {
            arrayOptions = Arrays.asList("rock", "paper", "scissors");
        }
        else {
            String[] tempArrayOptions = optionsGame.split(",");
            for (int i = 0; i < tempArrayOptions.length; i++) {
                tempArrayOptions[i] = tempArrayOptions[i].replace(" ","");
                if (mapOptions.containsKey(tempArrayOptions[i])){
                    arrayOptions.add(tempArrayOptions[i]);
                }
            }
        }

        return arrayOptions;
    }

    public static int playing(int rating) {
        boolean run = true;

        HashMap<String, List<String>> mapOptions = createMapOptions();

        List<String> arrayOptions = createArrayOptions(mapOptions);
        int bound = arrayOptions.size();

        System.out.println("Okay, let's start. For exit input '!exit'. Print score input '!rating'.");

        while (run) {
            String choice = MyScanner.writeInputString("Input your choice").toLowerCase();

            Random random = new Random();
            int choiceComputer = random.nextInt(bound);

            String option = arrayOptions.get(choiceComputer);

            if (choice.equals("!exit")) {
                run = false;
                System.out.println("Bye!");
            } else if (choice.equals("!rating")) {
                System.out.println("Your rating: " + rating);
            } else if (arrayOptions.stream().noneMatch(s->s.equals(choice))) {
                System.out.println("Incorrect value\n");
            } else if (mapOptions.containsKey(choice)) {
                rating = rating + getResult(mapOptions, choice, option);
            }
            else {
                System.out.println("Incorrect value\n");   
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
            String s;
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

        try (FileWriter fw = new FileWriter(fileName)){

            for (Map.Entry m : mapRating.entrySet()) {
                fw.write(m.getKey() + " " + m.getValue() + "\n");
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static HashMap<String, List<String>> createMapOptions() {
        HashMap<String, List<String>> mapOptions = new HashMap<>();

        mapOptions.put("rock", Arrays.asList("fire", "scissors", "snake", "human", "tree", "wolf", "sponge"));
        mapOptions.put("fire", Arrays.asList("scissors", "snake", "human", "tree", "wolf", "sponge", "paper"));
        mapOptions.put("scissors", Arrays.asList("snake", "human", "tree", "wolf", "sponge", "paper", "air"));
        mapOptions.put("snake", Arrays.asList("human", "tree", "wolf", "sponge", "paper", "air", "water"));
        mapOptions.put("human", Arrays.asList("tree", "wolf", "sponge", "paper", "air", "water", "dragon"));
        mapOptions.put("tree", Arrays.asList("wolf", "sponge", "paper", "air", "water", "dragon", "devil"));
        mapOptions.put("wolf", Arrays.asList("sponge", "paper", "air", "water", "dragon", "devil", "lightning"));
        mapOptions.put("sponge", Arrays.asList("paper", "air", "water", "dragon", "devil", "lightning", "gun"));
        mapOptions.put("paper", Arrays.asList("air", "water", "dragon", "devil", "lightning", "gun", "rock"));
        mapOptions.put("air", Arrays.asList("water", "dragon", "devil", "lightning", "gun", "rock", "fire"));
        mapOptions.put("water", Arrays.asList("dragon", "devil", "lightning", "gun", "rock", "fire", "scissors"));
        mapOptions.put("dragon", Arrays.asList("devil", "lightning", "gun", "rock", "fire", "scissors", "snake"));
        mapOptions.put("devil", Arrays.asList("lightning", "gun", "rock", "fire", "scissors", "snake", "human"));
        mapOptions.put("lightning", Arrays.asList("gun", "rock", "fire", "scissors", "snake", "human", "tree"));
        mapOptions.put("gun", Arrays.asList("rock", "fire", "scissors", "snake", "human", "tree", "wolf"));
        
        return mapOptions;
    }
    
    public static int getResult(HashMap<String, List<String>> mapOptions, String choice, String choiceComputer){
        List<String> array = mapOptions.get(choice);

        int rating=0;
        if (choice.equals(choiceComputer)){
            rating = 50;
            System.out.printf("There is a draw (%s)\n", choiceComputer);   
        } else if (array.contains(choiceComputer)) {
            rating = 100;
            System.out.printf("Well done. The computer chose %s and failed\n", choiceComputer);
        }
        else {
            System.out.printf("Sorry, but the computer chose %s\n", choiceComputer);
        }

        return rating;
    }

    @Override
    public void close() throws Exception {

    }
}
