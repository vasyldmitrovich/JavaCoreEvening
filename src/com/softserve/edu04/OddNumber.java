package com.softserve.edu04;
import java.util.*;

public class OddNumber {

    public static void main (String [] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Визначення кількості непарних чисел");
        int num;
        int count = 0;
        String ans;

        do {
            System.out.println("Введіть число: ");
            num = inp.nextInt();
            if (num % 2 == 0) {
                System.out.println("Це парне число. " +
                        "Введіть наступне число, щоб виконати перевірку. Якщо бажаєте завершити перевірку введіть NO");
            } else {
                System.out.println("Це непарне число. " +
                        "Введіть наступне число, щоб виконати перевірку. Якщо бажаєте завершити перевірку введіть NO");
                count++;
            }
            ans = inp.next();

        } while (!ans.equals("NO"));
        System.out.println("Кількість непарних чисел: " + count);
    }

}
