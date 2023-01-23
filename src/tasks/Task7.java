package tasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        System.out.println("Input number N and program will calculate factorial:");
        int number = 1;
        try {
            number = new Scanner(System.in).nextInt();
            if(number < 1) throw new Exception();
        }catch (Exception e){
            System.out.println("You`ve entered wrong number, try again! ");
            run();
            return;
        }

        int factorial = 1;
        for (int i = 1; i <= number; i++){
            factorial*=i;
        }

        System.out.println("Factorial is " + factorial);
    }
}
