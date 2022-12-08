package com.softserve.edu04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Continents {
    public static void main(String [] args) throws IOException {
        enum Cont {
            ASIA, AFRICA, AMERICA, EUROPE, AUSTRALIA;

        }
            BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введіть країну: ");
            String inpCountry = inp.readLine();

            switch(inpCountry){
                case "USA": case "Canada": case "Mexico":
                    System.out.println("Континент: " + Cont.AMERICA);
                    break;
                case "Cnina": case "Korea": case "Japan":
                    System.out.println("Континент: " + Cont.ASIA);
                    break;
                case "France": case "Ukraine": case "Italy":
                    System.out.println("Континент: " + Cont.EUROPE);
                    break;
                case "Mali": case "Libia": case "Egypt":
                    System.out.println("Континент: " + Cont.AFRICA);
                    break;
                case "Australia":
                    System.out.println("Континент: " + Cont.AUSTRALIA);
                    break;
                default:
                    System.out.println("Невірно введено назву");
            }

    }
}
