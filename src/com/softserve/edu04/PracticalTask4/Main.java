package com.softserve.edu04.PracticalTask4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        int n1, n2, n3;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //odd numbers
        PracticalTask.writeMessege("Enter first number");
        n1 = Integer.parseInt(br.readLine());

        PracticalTask.writeMessege("Enter second number");
        n2 = Integer.parseInt(br.readLine());

        PracticalTask.writeMessege("Enter third number");
        n3 = Integer.parseInt(br.readLine());

        boolean noOdd = true;
        if (PracticalTask.findOddNumber(n1)==true)
        {PracticalTask.writeMessege("Number "+n1+" is odd"); noOdd = false;};

        if (PracticalTask.findOddNumber(n2)==true)
        {PracticalTask.writeMessege("Number "+n2+" is odd"); noOdd = false;};

        if (PracticalTask.findOddNumber(n3)==true)
        {PracticalTask.writeMessege("Number "+n3+" is odd"); noOdd = false;};

        if (noOdd == true){PracticalTask.writeMessege("There aren't any odd numbers");}

        //Days of the week
        PracticalTask.writeMessege("\nEnter number day of the week");
        int ndw;
        ndw = Integer.parseInt(br.readLine());

        DaysWeek dw;

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
        PracticalTask.writeMessege("\nEnter country");
        String country = br.readLine();
        PracticalTask.showContinent(country);

        //Product
        Product product1 = new Product("orange", 10, 5);
        PracticalTask.writeMessege("\n"+product1.toString());
        Product product2 = new Product("apple", 2, 10);
        PracticalTask.writeMessege(product2.toString());
        Product product3 = new Product("banana", 7.5, 7.5);
        PracticalTask.writeMessege(product3.toString());
        Product product4 = new Product("pear", 3, 9.5);
        PracticalTask.writeMessege(product4.toString()+"\n");

        PracticalTask.getExpensive(product1, product2, product3, product4);

        PracticalTask.getBiggestItem(product1, product2, product3, product4);
    }
}
