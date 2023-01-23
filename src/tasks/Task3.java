package tasks;

import java.util.Scanner;

/*
* Roman Sitko
* */
public class Task3 {


    public static void getDollar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input cost One Dollar: ");
        double costOneDollar = Double.parseDouble(scanner.next());

        System.out.print("Input suma Gruvnya: ");
        int sumGruvnya = Integer.parseInt(scanner.next());

        if((costOneDollar >= 0.0f) && (sumGruvnya >= 0)) {
            double result = (double) sumGruvnya / costOneDollar;
            System.out.println("Count dollar: " + result);
        } else {
            System.out.println("Values is wrong");
        }
    }
}
