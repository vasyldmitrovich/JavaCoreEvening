package com.softserve.edu12.Task2;

public class Main {
    public static void main(String[] args) {
        try {
            Plant pl = new Plant("watermelon", "green", 121);
            System.out.println(pl);
            Plant pl1 = new Plant("pear", "yellow", 232);
            System.out.println(pl1);
            Plant pl2 = new Plant("persimmon", "orange", 343);
            System.out.println(pl2);
            Plant pl3 = new Plant("fig", "violet", 454);
            System.out.println(pl3);
            Plant pl4 = new Plant("strawberries", "red", 565);
            System.out.println(pl4);

        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + "\n");
            e.printStackTrace();
        }
    }
}