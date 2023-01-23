package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        System.out.println("Calculate how many times number 1 appeared");
        System.out.println("Enter N (Randomize method will generate 0 or 1 N times):");
        int number = 1;
        try {
            number = new Scanner(System.in).nextInt();
            if(number < 1) throw new Exception();
        }catch (Exception e){
            System.out.println("You`ve entered wrong number");
            run();
            return;
        }

        List<Integer> generatedNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < number; i++){
            generatedNumbers.add(random.nextInt(2));
        }

        System.out.println("Was generated such array: " + generatedNumbers);
        System.out.println("Count of 1: " + countOfOneNumbers(generatedNumbers));
    }

    private static long countOfOneNumbers(List<Integer> generatedNumbers){
        return generatedNumbers.stream().filter(num -> num == 1).count();
    }
}
