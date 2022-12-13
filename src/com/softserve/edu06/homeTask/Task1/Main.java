package com.softserve.edu06.homeTask.Task1;

public class Main {

    public static void main(String[] args) {
        run();
    }

    public static void run(){

        Eagle eagle = new Eagle(true, true);
        FlyingBird eagle2 = new Eagle(true, true);

        Swallow swallow = new Swallow(true,true);

        Penguin penguin = new Penguin(false, true);
        Kiwi kiwi = new Kiwi(true, true);

        Bird[] birds = {eagle, eagle2,swallow, penguin, kiwi};

        for (Bird bird: birds){
            bird.fly();
            System.out.println(bird);
        }
    }
}

