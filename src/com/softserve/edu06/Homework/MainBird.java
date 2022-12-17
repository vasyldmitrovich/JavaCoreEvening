package com.softserve.edu06.Homework;

public class MainBird {
    public static void main(String[] args) {
        Bird [] birds = new Bird[4];
                birds [0] = new Eagle(true, true);
                birds [1] = new Kiwi(false, true);
                birds [2] = new Penguin(false,true);
                birds [3] = new Swallow(true,true);

         for (Bird b: birds)  {
             System.out.println(b);
             b.fly();
         }
    }
}
