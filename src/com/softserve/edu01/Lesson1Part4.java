package lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson1Part4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What is your name? :");
        String name = reader.readLine();
        System.out.print("Where are you live? :");
        String address = reader.readLine();

        System.out.println("Your name is " + name + " and you are living in "+address);

    }
}
