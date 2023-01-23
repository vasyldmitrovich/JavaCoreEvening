package tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //todo: switch case
        System.out.println("Enter task number: ");
        int taskNumber = new Scanner(System.in).nextInt();

        switch (taskNumber){
            case 1:
                Task1.main(args);
                break;
            case 3:
                Task3.getDollar();
                break;
            case 4:
                Task4.countLetters();
                break;
            case 5:
                Task5.main(args);
                break;
            case 6:
                Task6.createSentence();
                break;
            case 7:
                Task7.main(args);
                break;
            case 9:
                Task9.main(args);
                break;
            default:
                System.out.println("no such task");
        }
    }
}
