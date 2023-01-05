package com.softserve.edu11.homeWork.Words;

import com.softserve.edu06.practicalTasks.car.UserEnter;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Words {
    private String sentence;
    ArrayList<String> arr = new ArrayList<>();

    public Words(){
        sentence = " ";
    }

    public Words(String sentence){
        this.sentence = sentence;
    }

    public String getSentence(){
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public void createSentence(){
        UserEnter.UserEnter("Введіть речення з 5 слів: ");
        sentence = UserEnter.inform;
    }
    public void findTheLongestWord(){
        int lengthWord = 0;
        String p = "[a-zA-Z\\`]+";
        Pattern pattern = Pattern.compile(p);
        Matcher m = pattern.matcher(sentence);
        int i = 0;

        while (m.find()){
            arr.add(i, sentence.substring(m.start(), m.end()) );
            i++;
        }

        if(arr.size() > 5){
            System.out.println("Речення містить більше 5 слів");
        } else if (arr.size() < 5) {
            System.out.println("Речення містить менше 5 слів");
        }else{
        for (String word: arr) {
            if(word.length() > lengthWord){
                lengthWord = word.length();
            }
        }
            for (String wordOutput: arr) {
                if(wordOutput.length() == lengthWord){
                    System.out.println("Найдовше слово: " + wordOutput + ", його довжина: " + lengthWord);
                }
            }
        }
    }

    public void reversWord(){
        if (arr.size() < 2) {
            System.out.println("В реченні немає другого слова");
        }else{
            StringBuilder input = new StringBuilder();
            input.append(arr.get(1));
            input.reverse();
            System.out.println("Друге слово в зворотньому порядку: " + input);
        }
    }

    public void sentencesWithoutSpaces(){
        String p = "[^ ]+";
        Pattern pattern = Pattern.compile(p);
        Matcher m = pattern.matcher(sentence);
        int i = 0;
        System.out.println("Речення без зайвих пробілів: ");
        while (m.find()){
            System.out.print(sentence.substring(m.start(), m.end()) + " " );
        }
    }

    @Override
    public String toString(){
        return sentence;
    }
}
