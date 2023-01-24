package com.softserve.graduation;

import com.softserve.service.MyScanner;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        play();
    }

    public static void play(){
        System.out.println("Let's play Rock-paper-scissors");

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

            if (choice < 1 | choice > 4) {
                System.out.println("Incorrect value\n");
            } else if (choice==4) {
               run = false;
               System.out.println("Bye!");
            } else if (choice == choiceComputer) {
                System.out.printf("There is a draw (%s)\n", option);
            } else if ((choice == 1 & choiceComputer == 2) | (choice == 2 & choiceComputer == 3) | (choice == 3 & choiceComputer == 1)) {
                System.out.printf("Sorry, but the computer chose %s\n", option);
            } else {
                System.out.printf("Well done. The computer chose %s and failed\n", option);
            }
        }
    }

    public static int inputChoice(){
        try {
            return MyScanner.writeInputInt("\nInput your choice: 1-rock, 2-paper, 3-scissors, 4-exit'");
        }
        catch (NumberFormatException e){
            return 0;
        }
    }
}
