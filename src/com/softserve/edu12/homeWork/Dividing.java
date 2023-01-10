package com.softserve.edu12.homeWork;

import com.softserve.edu06.practicalTasks.car.UserEnter;

public class Dividing {

    public double div() {
        UserEnter.UserEnter("Введіть число: ");
        double numb1 = Double.parseDouble(UserEnter.inform);

        UserEnter.UserEnter("Введіть число: ");
        double numb2 = Double.parseDouble(UserEnter.inform);

        if(numb2 == 0.0d){
            throw new ArithmeticException();
        }
        System.out.println("Результат ділення: " + numb1/numb2);
        return  numb1/numb2;
    }

    public static void main(String[] args) {
        Dividing divEx = new Dividing();

        try{
            divEx.div();

        } catch (ArithmeticException e){
            System.err.println("Ділити на 0 не можна");

        } catch (NumberFormatException ex){
            System.err.println("Невірний формат даних. " + ex.getMessage());
        }
    }
}
