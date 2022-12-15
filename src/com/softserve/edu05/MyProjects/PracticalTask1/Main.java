package com.softserve.edu05.MyProjects.Practicaltask1;

/* Roman Sitko.
Create an array of ten integers. Display 
the biggest of these numbers;
the sum of positive numbers in the array;
the amount of negative numbers in the array.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private  static int length = 0;

    public static void main (String[] args) throws IOException {

        //Input numbers of array from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter length of array: ");
        length = Integer.parseInt(br.readLine());
        int[] array = new int[length];
        int tmp = 0;
        while (tmp < length) {
            System.out.print("Enter int number " + tmp + ": ");
            array[tmp] = Integer.parseInt(br.readLine());
            tmp++;
        }

        //Using methods
        Main main = new Main();
        main.findBiggestNum(array);
        main.sumPozitiveNum(array);
        main.amountOfNegative(array);
        main.amoundValues(array);
    }

    //Find biggest number in array
    public void findBiggestNum (int[] array) {
        int max = array[0];
        for(int i = 0; i < length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Biggest number is: " + max);
    }

    //Calc suma pozitive numbers
    public void sumPozitiveNum (int[] array){
        int bigeestNum = 0;
        for(int i = 0; i < length; i++) {
            if (array[i] > 0) {
                bigeestNum = bigeestNum + array[i];
            }
        }
        System.out.println("Suma pozitive numbers: " + bigeestNum);
    }

    //Amount negative numbers
    public void amountOfNegative (int[] array) {
        int amount = 0;
        for(int i = 0; i < length; i++) {
            if (array[i] < 0) {
                amount++;
            }
        }
        System.out.println("Amount of negative numbers: " + amount);
    }

    //Calc values there are more: negative or positive
    public void amoundValues (int[] array) {
        int amountPoz = 0;
        int amountNeg = 0;

        for(int i = 0; i < length; i++) {
            if (array[i] < 0) {
                amountNeg++;
            }
            if (array[i] > 0) {
                amountPoz++;
            }
        }

        if(amountPoz > amountNeg) {
            System.out.println("There are more pozitive numbers");
        } else if (amountPoz < amountNeg) {
            System.out.println("There are more negative numbers");
        } else {
            System.out.println("There are equally amount negative and pozitive");
        }


    }

}