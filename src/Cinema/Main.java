package Cinema;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import static Cinema.Cinema.loadCinema;

public class Main {
    public static void main(String[] args) {

        run();
    }

    public static void run() {
        try {
            Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
            System.out.println("Enter the number of rows:");
            int rows = in.nextInt();
            System.out.println("Enter the number of seats in each row:");
            int seats = in.nextInt();
            String[][] newCinema = new String[rows + 1][seats + 1];
            loadCinema(newCinema, rows, seats);
            new Menu(new Scanner(System.in));
            Menu.start(newCinema, rows, seats);
        } catch (InputMismatchException e) {
            System.out.println("It must be a number...");
        }
    }
}

