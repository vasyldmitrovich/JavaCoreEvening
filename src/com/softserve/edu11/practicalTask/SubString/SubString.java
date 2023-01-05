package com.softserve.edu11.practicalTask.SubString;

import com.softserve.edu06.practicalTasks.car.UserEnter;

public class SubString {
    String subString;
    String text;

    public boolean checkSubstring(){
    UserEnter.UserEnter("Введіть рядок: ");
    subString = UserEnter.inform;

    UserEnter.UserEnter("Введіть текст який має містити рядок: ");
    text = UserEnter.inform;
    if (text.contains(subString)){
        System.out.println("___________\nТекст містить даний рядок");
        return true;
    } else {
        System.out.println("___________\nТекст не містить даного рядка");
        return false;
    }

    }
}
