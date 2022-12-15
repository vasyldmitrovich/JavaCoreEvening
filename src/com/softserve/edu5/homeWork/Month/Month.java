package com.softserve.edu5.homeWork.Month;

import java.util.Scanner;

public class Month {
   static int numberMonth;

   public static void enterNumberMonth(){
      Scanner inp = new Scanner(System.in);
      System.out.println("Введіть номер місця: ");
      numberMonth = inp.nextInt();
   }
   public static void printDay(){
      int [] dayMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      System.out.println("Кількість днів в місяці: " + dayMonth[numberMonth-1]);
   }
}
