package com.softserve.edu05.MyProjects.HomeworkTask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Roman Sitko.
Enter 10 integer numbers.
Calculate the sum of first 5 elements
if they are positive or product of last 5 element in the other case.
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 integer numbers: ");
        int[] num = new int[10];
        int sum = 0;
        int prod = 1;

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        //find negative of first 5 elements
        int tmp = 0;
        for (int i = 0; i < 5; i++) {
            if (num[i] < 0) {
                tmp++;
            }
        }

        //if there aren't negative of first 5 elements, we calc sum first 5 elements.
        if (tmp == 0) {
            for (int i = 0; i < 5; i++) {
                sum += num[i];
            }
        }

        //if there are negative of first 5 elements, we calc sum last 5 elements.
        if (tmp != 0) {
            for (int i = num.length - 1; i >= 5; i--) {
                prod = num[i] * prod;
            }
        }

        System.out.println("Suma: " + sum);
        System.out.println("Product: " + prod);


    }
}
