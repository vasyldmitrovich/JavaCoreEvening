package com.softserve.edu11.practicalTask;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        run();
    }

    public static void run(){
        System.out.println("Enter surname, name and patronymic:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] splitInput = input.split(" ");

        if (splitInput.length != 3){
            System.out.println("You entered wrong data...");
            return;
        }

        System.out.println("Surname with initials: " + getInitials(splitInput));
        System.out.println("Name: " + splitInput[1]);
        System.out.println("name, patronymic, surname: " + splitInput[1] + " " + splitInput[2] + " " + splitInput[0]);
    }

    public static String getInitials(String[] userData){
        String surnameWithInitials = "";
        for (int i = 0; i < 3; i++){
            if(i!=0){
                surnameWithInitials += userData[i].substring(0,1).toUpperCase() + ".";
            }else {
                surnameWithInitials += userData[i];
                surnameWithInitials+=" ";
            }

        }
        return surnameWithInitials;
    }

}
