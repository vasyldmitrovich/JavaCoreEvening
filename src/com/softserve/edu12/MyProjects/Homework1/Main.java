package com.softserve.edu12.MyProjects.Homework1;
/* Roman Sitko
*  Lesson 12, Homework 1
* */
public class Main {
    public static void main(String[] args) {
        double result = 0.0f;
        try {
            result = div(3, 1);
            System.out.printf("Result of divide: %.2f \n", result);
        } catch (ArithmeticException e) {
            System.out.println("Divided by zero operation cannot possible");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Some Exception");
            e.printStackTrace();
        } finally {
            result = 0.0f;
            System.out.println("End of program");
        }
    }


    public static double div(double a, double b) throws ArithmeticException {
        double result = 0;
        if (Double.isNaN(a) | Double.isNaN(b)) {
            throw new ArithmeticException();
        }
        if (Double.isInfinite(a) | Double.isInfinite(b)) {
            throw new ArithmeticException();
        }
        if (a == 0 | b == 0) {
            throw new ArithmeticException();
        }

        return a / b;
    }
}
