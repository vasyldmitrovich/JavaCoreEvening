package com.softserve.edu04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Range {
    public static void main(String[] args) throws IOException {
        /*for (int i = 0; i < 3; i++){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть число типу float : ");
        float inp = Float.parseFloat(br.readLine());
        if (inp > 5.0f || inp < -5.0f){
            System.out.println("Число не належить до вказаного діапазону");
        } else {System.out.println("Число належить до вказаного діапазону");}
        }*/
        int[] inp = new int[3];
        int maxV = 0;
        int minV = 0;
        for (int i = 0; i < inp.length; i++) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введіть число типу int : ");
            inp[i] = Integer.parseInt(br.readLine());
        }
        for (int j = 0; j < 3; j++) {
            maxV = inp[0];
            if (inp[j] > maxV) {
                maxV = inp[j];
            }
        }
        for (int k = 0; k < 3; k++) {
            minV = inp[0];
            if (inp[k] < minV) {
                minV = inp[k];
                }
            }
            System.out.println("Максимальне число: " + maxV);
            System.out.println("Мінімальне число: " + minV);
        }
    }



