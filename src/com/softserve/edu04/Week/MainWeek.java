package com.softserve.edu04.Week;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

public class MainWeek {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int DayOfWeek = Integer.parseInt(br.readLine());

        System.out.println("Ведіть порядковий номер дня тижня:");

        switch (DayOfWeek) {
            case 1 -> {
                System.out.println("Your Choise is: " + TaskWeek.First.getEn());
                System.out.println("Ви обрали: " + TaskWeek.First.getUa());
            }
            case 2 -> {
                System.out.println("Your Choise is: " + TaskWeek.Second.getEn());
                System.out.println("Ви обрали: " + TaskWeek.Second.getUa());
            }
            case 3 -> {
                System.out.println("Your Choise is: " + TaskWeek.Third.getEn());
                System.out.println("Ви обрали: " + TaskWeek.Third.getUa());
            }
            case 4 -> {
                System.out.println("Your Choise is: " + TaskWeek.Fourth.getEn());
                System.out.println("Ви обрали: " + TaskWeek.Fourth.getUa());
            }
            case 5 -> {
                System.out.println("Your Choise is: " + TaskWeek.Fifth.getEn());
                System.out.println("Ви обрали: " + TaskWeek.Fifth.getUa());
            }
            case 6 -> {
                System.out.println("Your Choise is: " + TaskWeek.Sixth.getEn());
                System.out.println("Ви обрали: " + TaskWeek.Sixth.getUa());
            }
            case 7 -> {
                System.out.println("Your Choise is: " + TaskWeek.Seventh.getEn());
                System.out.println("Ви обрали: " + TaskWeek.Seventh.getUa());
            }

            default -> {
                System.out.println("Москальської не розумію! Вчи Англійську!");
            }
        }

    }
}
