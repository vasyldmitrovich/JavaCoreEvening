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

        System.out.println(num.length);
        for(int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(br.readLine());
//            System.out.println("num " + i + ": " + num[i]);
        }

//        for(int i = 0; i < num.length; i++) {
//            System.out.println(i + ": " + num[i] + ", ");
//        }


        for(int i = 0; i < num.length; i++) {
            if(num[i] > 0) {
                sum = num[i] + sum;
            }
        break;
        }
        System.out.println(sum);



    }

}
