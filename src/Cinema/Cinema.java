package Cinema;

import java.util.Objects;

public class Cinema {
    /**
     * Maximum number of seats in the screen room,
     * then the price of each ticket is 10 dollars.
     */
    static final int MAX_SEATS = 60;
    static final int TICKET_NORMAL_PRICE = 10; //Normal ticket price for the front half.
    static final int TICKET_LOW_PRICE = 8;     //Lower ticket price for the back half.
    static int purchasedTickets = 0;
    static int currentIncome = 0;
    static int totalSeats = 0;

    /**
     * Load initial status of cinema, calculate total number of seats.
     *
     * @param rows      Number of rows in the cinema.
     * @param seats     Number of seats in each row in the cinema.
     * @param newCinema 2D Multi-dimensional array that represent a cinema.
     */
    static void loadCinema(final String[][] newCinema, int rows, int seats) {

        for (int i = 0; i < newCinema.length; i++) {
            for (int j = 0; j < newCinema[i].length; j++) {
                if (i == 0 && j == 0) {
                    newCinema[i][j] = " ";
                } else if (i == 0) {
                    newCinema[i][j] = String.valueOf(j);
                } else if (j == 0) {
                    newCinema[i][j] = String.valueOf(i);
                } else {
                    newCinema[i][j] = "S";
                }
                System.out.println();
            }
        }
        totalSeats = rows * seats;
    }

    /**
     * Print actual status of cinema.
     *
     * @param newCinema 2D Multi-dimensional array that represent a cinema.
     */
    public static void printCinema(final String[][] newCinema) {
        System.out.println();
        System.out.println("Cinema:");
        for (String[]row : newCinema) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    /**
     * Calculate ticket price for the chosen seat,
     * update CURRENT_INCOME and number of PURCHASED_TICKETS.
     *
     * @param newCinema 2D Multi-dimensional array that represent a cinema.
     * @param rows      Number of rows in the cinema.
     * @param seats     Number of seats in each row in the cinema.
     * @param rNum      Number of chosen row.
     * @param sNum      Number of chosen seat in the row.
     */

    public static void buyingTicket(final String[][] newCinema, final int rows, final int seats,
                                    final int rNum, final int sNum) {
        int currentPrice;
        if (Objects.equals(newCinema[rNum][sNum], "X")) {
            System.out.println("That ticket has already been purchased!");
        } else {
            System.out.println();
            int totalSeats = rows * seats;

            if (totalSeats <= MAX_SEATS) {
                currentPrice = TICKET_NORMAL_PRICE;
            } else if (rNum <= rows / 2) {
                currentPrice = TICKET_NORMAL_PRICE;
            } else {
                currentPrice = TICKET_LOW_PRICE;
            }
            System.out.println("Ticket price: $" + currentPrice);
            newCinema[rNum][sNum] = "X";

            currentIncome += currentPrice;
            purchasedTickets++;
        }
    }
}
