package com.softserve.edu12.homeTask;

public class Task1 {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        try {
            div(10,0);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception: " + e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static double div(double first, double second) throws ArithmeticException{
        if (second == 0) throw new ArithmeticException("Division by zero");
        return first / second;
    }
}
