package com.softserve.Tasks;

public class Task7 {

    //7. Input number n and calculate n! (e.g. 5! = 1*2*3*4*5 = 120)

    public int fac(int n) {
        if (n == 1)
            return 1;
        return n * fac(n -1);
    }
}
