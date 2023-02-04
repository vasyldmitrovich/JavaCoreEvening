package Cinema;

import java.text.DecimalFormat;

public class Statistics extends Cinema {

    /**
     * Calculate total income of the cinema.
     *
     * @param rows  Number of rows in the cinema.
     * @param seats Number of seats in each row in the cinema.
     */
    public static void totalIncome(final int rows, final int seats) {
        int totalSet = rows * seats;
        if (totalSet <= MAX_SEATS) {
            System.out.println("Total income: $" + totalSet * TICKET_NORMAL_PRICE);
        } else {
            int frontHalf = ((rows / 2) * seats) * TICKET_NORMAL_PRICE;
            int backHalf = ((rows - rows / 2) * seats) * TICKET_LOW_PRICE;
            System.out.println("Total income: $" + (frontHalf + backHalf));
        }
    }

    /**
     * Calculate the number of tickets sold.
     */
    public static void purchasedTickets() {

        System.out.println("Number of purchased tickets: " + purchasedTickets);
    }

    /**
     * Calculate the number of purchased tickets represented as a percentage.
     */
    public static void calculateSoldSeats() {
        float rate = (purchasedTickets * 100.0f) / totalSeats;
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println("Percentage: " + f.format(rate) + "%");
    }
}
