package com.softserve.edu10.homeWork.MapPerson;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MapPerson {
    public static void main(String[] args) {
        Map<String, String> person = new HashMap<>();
        person.put("Ivanov", "Ivan");
        person.put("Petrov", "Petro");
        person.put("Guk", "Oleh");
        person.put("Mak", "Olha");
        person.put("Shevchenko", "Roma");
        person.put("Kozak", "Leonid");
        person.put("Slyvka", "Slavik");
        person.put("Koval", "Kateryna");
        person.put("Ingul", "Yana");
        person.put("Olijnyk", "Roman");


        for (Map.Entry entry : person.entrySet()) {
            System.out.println("Прізвище: " + entry.getKey() + "----> ім'я: " + entry.getValue());
        }

        LinkedList <String> valueList = new LinkedList<>();
        valueList.addAll(person.values());

        boolean indicate = true;

        for (String name: valueList) {
            if(Collections.frequency(valueList, name) > 1){
                System.out.println("__________________________" +
                        "\nЩонайменше двоє людей мають однакове ім'я");
                indicate = false;
                break;
            }
        }
        if(indicate == true){
                System.out.println("________________________" +
                "\nЛюдей з однаковим іменем немає");
        }

        String removeKey = " ";
        for (Map.Entry entryRemove : person.entrySet()) {
            if(entryRemove.getValue().equals("Roma")){
                removeKey = (String) entryRemove.getKey();
            }
        }
        person.remove(removeKey);
        System.out.println(person);
        }
    }




