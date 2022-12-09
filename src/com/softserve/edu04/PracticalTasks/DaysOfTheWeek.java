package softserve.edu04.PracticalTasks;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch (number) {
            case 1 -> System.out.println("Понеділок, " + "Monday");
            case 2 -> System.out.println("Вівторок, " + "Tuesday");
            case 3 -> System.out.println("Середа, " + "Wednesday");
            case 4 -> System.out.println("Четвер, " + "Thursday");
            case 5 -> System.out.println("П'тниця, " + " Friday");
            case 6 -> System.out.println("Субота, " + "Saturday");
            case 7 -> System.out.println("Неділя, " + "Sunday");
            default -> System.out.println("No this day");
        }
    }
}
