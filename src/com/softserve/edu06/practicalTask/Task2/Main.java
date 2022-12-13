package com.softserve.edu06.practicalTask.Task2;

public class Main {

    public static void main(String[] args) {
        run();
    }

    public static void run(){

        Line line1 = new Line(new Point(10,2), new Point(12, 3));
        Line line2 = new Line(new Point(8,4), new Point(7, 2));

        ColorLine colorLine1 = new ColorLine(new Point(10,5), new Point(3, 1), "Red");
        Line colorLine2 = new ColorLine(new Point(10,5), new Point(3, 1), "Blue");

        Line[] lines = {line1, line2, colorLine1, colorLine2};
        for (Line line:lines){
            System.out.println(line);
        }
    }
}

