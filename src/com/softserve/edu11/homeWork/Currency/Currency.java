package com.softserve.edu11.homeWork.Currency;

import com.softserve.edu06.practicalTasks.car.UserEnter;

public class Currency {
    float currency;

    public void calculateRate(){
        UserEnter.UserEnterNumFloat("Введіть суму, яку потрібно перевести в долари: ");
        float sum = (float) UserEnter.numFloat;
        UserEnter.UserEnterNumFloat("Введіть курс долара: ");
        float rate = (float) UserEnter.numFloat;

        currency = sum/rate;
        System.out.println(String.format("$%.2f", currency));

    }
}
