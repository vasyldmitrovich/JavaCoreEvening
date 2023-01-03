package com.softserve.edu11.PracticalTask;

import static com.softserve.edu11.PracticalTask.Tasks.*;

public class main {

    public static void main(String[] args){
        run();
    }

    public static void run(){
        task1();
        task2();

        String[] newUserNames = new String[]{"anna","Olga_junior","KettyRed123","*Katrina*","Ketty.Red"};
        task3(newUserNames);

    }

}
