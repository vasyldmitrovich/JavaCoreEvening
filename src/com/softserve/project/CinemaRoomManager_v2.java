package com.softserve.project;

import java.util.Scanner;

public class CinemaRoomManager_v2 {
    static int currentIncome;
    static int totalIncome;
    static int counter;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = sc.nextInt();
        String[][] cinema = new String[rows][seats];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                cinema[i][j] = "S";
            }
        }
        int menu= -1;
        while (menu != 0) {
            System.out.println();
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    showTheSits(cinema);
                    break;
                case 2:
                    buyTicket(cinema, rows, seats);
                    break;
                case 3:
                    statistics(rows, seats);
                case 0:
                    break;
            }
        }
    }

    public static void showTheSits(String[][] cinema) {
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i <= cinema[0].length; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < cinema.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < cinema[i].length; j++) {
                System.out.print(" " + cinema[i][j]);
            }
            System.out.println();
        }
    }

    public static void buyTicket(String[][] cinema, int rows, int seats){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row number:");
        int row = sc.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seat = sc.nextInt();
        if (row < 1 || row > rows || seat < 1 || seat > seats) {
            System.out.println("Wrong input!\n");
            buyTicket(cinema, rows, seats);
            return;
        } else if (cinema[row - 1][seat - 1].equals("B")) {
            System.out.println("\nThat ticket has already been purchased!\n");
            buyTicket(cinema, rows, seats);
            return;
        } else {
            cinema[row - 1][seat - 1] = "B";
            counter++;
            currentIncome += ticketPrice(cinema, row);
        }
        System.out.println("Ticket price: $" + ticketPrice(cinema, row));
//        cinema[row-1][seat-1] = "B";
    }

    public static int ticketPrice(String[][] cinema, int row) {
        int numbersSeats = cinema.length * cinema[0].length;
        int price = 0;
        if (numbersSeats < 60) {
            price = 10;
        } else {
            int r2 = cinema.length / 2;
            if (row > r2) {
                price = 8;
            } else {
                price = 10;
            }
        }
        return price;
        //System.out.println("Ticket price: $" + price);
    }

    public static void statistics(int rows, int seats) {
        PercentIncomeTotal(rows, counter, seats);
        System.out.printf("Current income: $%d \n", currentIncome);
        System.out.println("Total income: $" + totalIncome);
    }

    private static void PercentIncomeTotal(int rows, int counter, int seats) {
        float perCent;
        int back = rows - (seats / 2);
        int r2 = rows / 2;
        System.out.println("Number of purchased tickets:" + counter);
        perCent = ((float) counter / (float) (rows * seats)) * 100;
        System.out.printf("Percentage: %.2f%%", perCent);
        System.out.println();
        if (rows * seats < 60) {
            totalIncome = rows * seats * 10;
        }
        if (rows * seats > 60) {
            totalIncome = (r2 * rows * 10) + (back * seats * 8);

        }
    }


}
