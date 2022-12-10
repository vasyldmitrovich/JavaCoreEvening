package com.softserve.edu04.Week;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

public class MainWeek {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String DayOfWeek = Integer.parseInt(br.readLine());

        System.out.println("Ведіть порядковий номер дня тижня:");

        switch (DayOfWeek) {
            case "First" -> {
                System.out.println("Your Choise is: " + TaskWeek.First.getEn());
                System.out.println("Ви обрали: " + TaskWeek.First.getUa());
            }
            case "Second" -> {
                System.out.println("Your Choise is: " + TaskWeek.Second.getEn());
                System.out.println("Ви обрали: " + TaskWeek.Second.getUa());
            }
            case "Third" -> {
                System.out.println("Your Choise is: " + TaskWeek.Third.getEn());
                System.out.println("Ви обрали: " + TaskWeek.Third.getUa());
            }
            case "Fourth" -> {
                System.out.println("Your Choise is: " + TaskWeek.Fourth.getEn());
                System.out.println("Ви обрали: " + TaskWeek.Fourth.getUa());
            }
            case "Fifth" -> {
                System.out.println("Your Choise is: " + TaskWeek.Fifth.getEn());
                System.out.println("Ви обрали: " + TaskWeek.Fifth.getUa());
            }
            case "Sixth" -> {
                System.out.println("Your Choise is: " + TaskWeek.Sixth.getEn());
                System.out.println("Ви обрали: " + TaskWeek.Sixth.getUa());
            }
            case "Seventh" -> {
                System.out.println("Your Choise is: " + TaskWeek.Seventh.getEn());
                System.out.println("Ви обрали: " + TaskWeek.Seventh.getUa());
            }

            default -> {
                System.out.println("Москальської не розумію! Вчи Англійську!");
            }
        }

    }
}
