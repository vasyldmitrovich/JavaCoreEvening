package softserve.edu04.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        String input;
        System.out.print("Please enter country name: ");
        input= br.readLine();
        System.out.println("This country is on "+ Countries.getContinent(input) + " continent");

    }
}
