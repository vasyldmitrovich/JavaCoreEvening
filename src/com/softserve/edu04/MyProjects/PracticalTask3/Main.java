package com.softserve.edu04.MyProjects.PracticalTask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Enter the name of the country.
*Print the name of the continent(Declare enum with names of continents)
*/
public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter countrie (Italy, Ukraine, Spaine, Japan):");
        String countrie = br.readLine();
        switch (countrie) {
            case "Italy":
                System.out.println(Countries.Europe);
                break;
            case "Ukraine":
                System.out.println(Countries.Europe);
                break;
            case "Spaine":
                System.out.println(Countries.Europe);
                break;
            case "Japan":
                System.out.println(Countries.Asia);
                break;
            default:
                System.out.println("No continent");
        }



//        Countries countries = Countries.Asia;
//        System.out.println(countries.values());

//        for (Countries countries1 : Countries.values()) {
//            System.out.println(countries1); // current.toString()
//        }


    }
}
