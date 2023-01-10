package com.softserve.edu12.homeWork;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class ReadNumber {
    int[] arr = new int[10];

    public void readNumber(int start, int end) {
        System.out.println("Введіть число: ");
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        try {
            int i = 0;
            while ( i < 10) {
                int enteredNumber = Integer.parseInt(sc.readLine());
                if (start <= enteredNumber && enteredNumber <= end) {
                    arr[i] = enteredNumber;
                    i++;
                } else {
                    throw new OutOfRangeNumberException();
                }
            }
            for (int j = 0; j < 10; j++){
                System.out.print(arr[j] + " ");
            }

        } catch (OutOfRangeNumberException e) {
            e.getMessage();

        } catch (NumberFormatException ex) {
            System.err.println("Невірний формат даних\n" + ex);

        } catch (IOException e) {
            throw new RuntimeException(e);

        } finally {
            try {
                sc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
