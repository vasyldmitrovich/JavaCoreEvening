package com.softserve.edu06.PracticalTask2;

public class Main {
    public static void main(String[] args) {
        Main.run();

    }
    public static void run() {

        Line[] lines = new Line[2];
        lines[0] = new Line(new Point(4, 8), new Point(2,6));
        lines[1] = new ColorLine(new Point(3.4, 6.5), new Point(9.2, 1.5), "green");

        for (Line line : lines) {
            line.print();
        }
    }

}