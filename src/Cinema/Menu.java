package Cinema;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Cinema.Cinema.buyingTicket;
import static Cinema.Cinema.printCinema;
import static Cinema.Statistics.*;

public class Menu {
    private static Scanner scanner;
    public Menu(Scanner scanner) {
        Menu.scanner = scanner;
    }

    private static void printMenu() {
        System.out.println("""
                
                1. Show the seats
                2. Buy a ticket
                3. Statistics
                0. Exit""");
    }
    /**
     * Upload the menu.
     *
     * @param newCinema 2D Multi-dimensional array that represent a cinema.
     * @param rows      Number of rows in the cinema.
     * @param seats     Number of seats in each row in the cinema.
     */
    public static void start(final String[][] newCinema, final int rows, final int seats) {
        int key;
        try {
            if (Menu.scanner != null) {
                do {
                    printMenu();
                    System.out.print("\nEnter your choice:");
                    key = Menu.scanner.nextInt();
                    switch (key) {
                        case 1 -> printCinema(newCinema);
                        case 2 -> {
                            try {
                                Scanner sc3 = new Scanner(System.in);
                                System.out.println("\nEnter a row number:");
                                int rNum = sc3.nextInt();
                                System.out.println("\nEnter a seat number in that row:");
                                int sNum = sc3.nextInt();
                                buyingTicket(newCinema, rows, seats, rNum, sNum);
                            } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
                                System.out.println("Wrong input!!!");
                            }
                        }
                        case 3 -> {
                            System.out.println();
                            purchasedTickets();
                            calculateSoldSeats();
                            System.out.println("Current income: $" + currentIncome);
                            totalIncome(rows, seats);
                        }
                        case 0 -> System.exit(0);
                        default ->
                                System.out.println("\nThere is no such option in the MENU, please try another one...");
                    }
                }
                while(true);
            }
        } catch (InputMismatchException e) {
            System.out.println("It must be a number 0-3...");
        }
    }
}
