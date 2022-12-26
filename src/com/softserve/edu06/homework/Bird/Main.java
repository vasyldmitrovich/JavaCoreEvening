package com.softserve.edu06.homework.Bird;

public class Main {
    public static void main(String[] args) {
        birds();
    }

    private static void birds() {
        Bird[] birds = {
                new Eagle(true, true),
                new Swallow(true, true),
                new Penguin(false, true),
                new Chicken(false, true)
        };
        for (Bird temp : birds) {
            temp.fly();
            System.out.println(temp);
        }

    }
}
