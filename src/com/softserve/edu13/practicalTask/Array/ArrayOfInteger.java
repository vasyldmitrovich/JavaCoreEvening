package com.softserve.edu13.practicalTask.Array;

import com.softserve.edu13.practicalTask.Array.CountEl;

public class ArrayOfInteger {

public int count(int [] arr, CountEl ref ){
    int countElement = 0;
    System.out.print("Елементи: ");
    for (int i = 0; i < 10; i++) {
        if(ref.checkCondition(arr[i])){
            System.out.print(arr[i] + " ");
            countElement ++;
        }
    }
    return countElement;
}

}
