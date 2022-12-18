package com.softserve.edu06.practicalTasks.color;

public class Line {

    public static void lineCreateObject() {
        Point objectPoint1 = new Point();
        objectPoint1.setX(2);
        objectPoint1.setY(4);

        Point objectPoint2 = new Point(3, 5);
        System.out.println();
 //використовує метод Print() з класу Point
        objectPoint1.Print();
        objectPoint2.Print();
    }

    public void Print() {
        System.out.println("Метод класу Line");
        System.out.println(toString());
    }

}
