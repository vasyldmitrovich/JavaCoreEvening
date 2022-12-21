package com.softserve.edu08.PracticalTask;

public class main {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        Department A1 = new Department("New York", "Medison", 52);
        System.out.println("Original Object" + A1);
        Department  A2 = (Department) A1.clone();
        System.out.println("Clon Object1" +A2);

//
        A2.getAdress().setCity("Monaco");
        System.out.println("New Clon Object" + A2);

    }


}
