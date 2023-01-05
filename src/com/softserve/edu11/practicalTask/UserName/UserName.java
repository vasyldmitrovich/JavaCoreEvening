package com.softserve.edu11.practicalTask.UserName;

import com.softserve.edu06.practicalTasks.car.UserEnter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserName {
    private String name;
    private String surname;
    private String patronymic;

    public UserName(){
        name = "";
        patronymic = "";
        surname = "";
    }

    public UserName(String surname, String name, String patronymic){
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void printUserInfo(){
        UserEnter.UserEnter("Введіть прізвище ім'я та по-батькові: ");
        String arr [] = UserEnter.inform.split(" ");
        System.out.println(arr.length);
        if(arr.length==3){
        String newSurname = arr[0].substring(0,1).toUpperCase() + arr[0].substring(1).toLowerCase();
        String newName = arr[1].substring(0,1).toUpperCase() + arr[1].substring(1).toLowerCase();
        String newPatronymic = arr[2].substring(0,1).toUpperCase() + arr[2].substring(1).toLowerCase();
        System.out.println("Прізвище та ініціали: " + arr[0] + " " + arr[1].charAt(0) + ". " + arr[2].charAt(0) + ".");
        System.out.println("Ім'я: " + arr[1]);
        System.out.println("Ім'я, по-батькові та прізвище: " + arr[1] + " " + arr[2] + " " + arr[0]);
        } else {
            System.out.println("Перевірте правильність введених даних");
        }
    }

    public void checkUserName(){
        String p = "[a-zA-Z]{3,15}[0-9_]*";
        toString();
        if(Pattern.matches(p,getSurname()) && Pattern.matches(p,getName()) && Pattern.matches(p,getPatronymic())){
            System.out.println("Дані введено вірно");}
        else if (!Pattern.matches(p,getSurname()) && !Pattern.matches(p,getName()) ||
                 !Pattern.matches(p,getName()) && !Pattern.matches(p,getPatronymic())||
                 !Pattern.matches(p,getSurname()) && !Pattern.matches(p,getPatronymic())||
                 !Pattern.matches(p,getSurname()) && !Pattern.matches(p,getName()) && !Pattern.matches(p,getPatronymic())
        ){System.out.println("Дані введено невірно");}
        else if (!Pattern.matches(p,getSurname())){
            System.out.println("Невірно введено прізвище");}
        else if (!Pattern.matches(p,getName())) {
            System.out.println("Невірно введено ім'я");}
        else if (!Pattern.matches(p,getPatronymic())) {
            System.out.println("Невірно введено по-батькові");}
    }

    @Override
    public String toString(){
        System.out.println("Surname: " + getSurname() + ", name: " + getName() + ", patronymic: " + getPatronymic());
        return null;
    }
}


