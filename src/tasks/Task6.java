package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {

        static int i = 0;
        public static void createSentence() {

            BufferedReader inf  = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введіть речення: ");
            String sentence;
            try {
                sentence = inf.readLine();
                findWord(sentence);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

        public static void main(String[] args) {
            createSentence();
        }

        public static void findWord(String sentence){
            int lengthWord = 0;
            String p = "[a-zA-Z\\`]+";
            Pattern pattern = Pattern.compile(p);
            Matcher m = pattern.matcher(sentence);

            while (m.find()){
                i++;
            }
            System.out.println("Кількість слів: " + i);
       }


}


