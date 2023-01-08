package com.softserve.edu12.PracticalTask.Task2;

public class main {
    public static void main(String[] args) {
        try {
            Plant pl = new Plant("currant", "white", 111);
            System.out.println(pl);
            Plant pl1 = new Plant("cherry", "red", 222);
            System.out.println(pl1);
            Plant pl2 = new Plant("blackberry", "blue", 333);
            System.out.println(pl2);
            Plant pl3 = new Plant("Cherry", "black", 444);
            System.out.println(pl3);
            Plant pl4 = new Plant("potato", "red", 555);
            System.out.println(pl4);

        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + "\n");
            e.printStackTrace();
        }
    }
}
