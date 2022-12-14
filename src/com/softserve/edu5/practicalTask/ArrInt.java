package com.softserve.edu5.practicalTask;

public class ArrInt {
    public static void main(String[] args) {
        int [] arr = {5, 10, -15, 6, -11, 2, 3, 6, 19, -12};
        int biggest = 0;
        int sumPos = 0;
        int countPos = 0;
        int countNeg = 0;
        for( int i: arr){
            if(i > biggest){
                biggest = i;
            }
            if(i > 0){
                sumPos += i;
                countPos++;
            }else{
                countNeg++;
            }
        }
        System.out.println("Найбільше число в масиві: " + biggest);
        System.out.println("Сума додатніх чисел в масиві: " + sumPos);
        System.out.println("Кількість додатніх чисел в масиві: " + countPos +
                ", кількість від'ємних чисел: " + countNeg +
                ". Масив містить більше " + (countPos > countNeg ? "додатніх чисел." : "від'ємних чисел."));
    }
}
