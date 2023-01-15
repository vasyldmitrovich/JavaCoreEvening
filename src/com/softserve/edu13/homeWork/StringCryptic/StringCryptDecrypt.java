package com.softserve.edu13.homeWork.StringCryptic;

import com.softserve.edu06.practicalTasks.car.UserEnter;
import com.softserve.edu13.homeWork.StringCryptic.StringCryptic;

public class StringCryptDecrypt {


    public void encrypt(StringCryptic ref){
        UserEnter.UserEnter("Введіть рядок, який потрібно закодувати: ");
        String stringEnter = UserEnter.inform;
        UserEnter.UserEnterNum("Введіть число, яке використовуватиметься при кодуванні: ");
        int n = UserEnter.numb;

        System.out.println(ref.crString(stringEnter, n));

    }

    public void decrypt(StringCryptic ref){
        UserEnter.UserEnter("Введіть рядок, який потрібно розкодувати: ");
        String stringEnter = UserEnter.inform;
        UserEnter.UserEnterNum("Введіть число, яке використовуватиметься при кодуванні: ");
        int n = UserEnter.numb;

        System.out.println(ref.crString(stringEnter, n));

    }

}
