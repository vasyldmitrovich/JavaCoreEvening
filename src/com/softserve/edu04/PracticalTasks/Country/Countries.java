package com.softserve.edu04.PracticalTasks.Country;

import java.util.Scanner;

public class Countries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        switch (name){
            case "Poland": case "Italy": case "Ukraine": case "India":
                System.out.println(Continents.EURASIA);
                break;
            case "Angola": case "Gabon": case "Zimbabwe":
                System.out.println(Continents.AFRICA);
                break;
            case"Canada": case "Cuba": case "Peru":
                System.out.println(Continents.AMERICA);
            case "Australia":
                System.out.println(Continents.AUSTRALIA);
            default: System.out.println("No this country");
        }
    }
}
