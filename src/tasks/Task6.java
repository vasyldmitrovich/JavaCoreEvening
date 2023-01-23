package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {

        private String sentence;
        int i = 0;
        public void createSentence() {

            BufferedReader inf  = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введіть речення: ");
            try {
                sentence = inf.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        public void findWord(){
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


