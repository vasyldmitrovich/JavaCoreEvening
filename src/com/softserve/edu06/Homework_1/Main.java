package com.softserve.edu06.Homework_1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(true, true),
                new Swallow(true, true),
                new Penguin(false, true),
                new Chicken(true, true),
                new FlyingBird(true, true),
                new NotFlyingBird(false, false)
        };
        for (Bird bird : birds) {
            bird.fly();
        }
        System.out.println();
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
}
