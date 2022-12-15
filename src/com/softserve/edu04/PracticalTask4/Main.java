package com.softserve.edu04.PracticalTask4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        go();
    }

    public static void go()throws IOException{
        int n1, n2, n3;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*Divide tasks in that method to difference method
        * like first task in its own method, second task in another method etc.*/
        //odd numbers
        PracticalTask.writeMessege("Input a first number");
        n1 = Integer.parseInt(br.readLine());

        PracticalTask.writeMessege("Input a second number");
        n2 = Integer.parseInt(br.readLine());

        PracticalTask.writeMessege("Input a third number");
        n3 = Integer.parseInt(br.readLine());

        boolean noOdd = true;
        /*When you write code, use key combination for reformat code Ctrl+Alt+L*/
        if (PracticalTask.findOddNumber(n1))
        {PracticalTask.writeMessege("Number "+n1+" is odd"); noOdd = false;}

        if (PracticalTask.findOddNumber(n2))
        {PracticalTask.writeMessege("Number "+n2+" is odd"); noOdd = false;}

        if (PracticalTask.findOddNumber(n3))
        {PracticalTask.writeMessege("Number "+n3+" is odd"); noOdd = false;}

        if (noOdd){PracticalTask.writeMessege("There aren't any odd numbers");}

        //Days of the week
        PracticalTask.writeMessege("\nInput a number day of the week");
        int ndw;
        ndw = Integer.parseInt(br.readLine());

        switch (ndw){
            case 1: PracticalTask.showDayWeek(DaysWeek.MONDAY);
                break;
            case 2: PracticalTask.showDayWeek(DaysWeek.TUESDAY);
                break;
            case 3: PracticalTask.showDayWeek(DaysWeek.WEDNESDAY);
                break;
            case 4: PracticalTask.showDayWeek(DaysWeek.THURSDAY);
                break;
            case 5: PracticalTask.showDayWeek(DaysWeek.FRIDAY);
                break;
            case 6: PracticalTask.showDayWeek(DaysWeek.SATURDAY);
                break;
            case 7: PracticalTask.showDayWeek(DaysWeek.SUNDAY);
                break;
            default: System.out.println("No this day of the week");
        }

        //Countries
        PracticalTask.writeMessege("\nInput a country");
        String country = br.readLine();
        PracticalTask.showContinent(country.toLowerCase());

        //Product
        Product product1 = new Product("orange", 10, 5);
        PracticalTask.writeMessege("\n"+product1);
        Product product2 = new Product("apple", 2, 10);
        PracticalTask.writeMessege(product2.toString());
        Product product3 = new Product("banana", 7.5, 7.5);
        PracticalTask.writeMessege(product3.toString());
        Product product4 = new Product("pear", 3, 9.5);
        PracticalTask.writeMessege(product4+"\n");

        PracticalTask.getExpensive(product1, product2, product3, product4);

        PracticalTask.getBiggestItem(product1, product2, product3, product4);
    }
}
