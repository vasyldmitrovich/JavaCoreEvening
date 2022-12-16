package com.softserve.edu06.PracticalTask.Line;

public class MainLine {
    public static void main(String[] args) {
        Line[] lines = new Line[2];
        lines[0] = new Line(new Point(15, 17), new Point(15, 18));
        lines[1] = new ColorLine(new Point(13, 18), new Point(5, 11), "yellow");

        for (Line l : lines) {
            System.out.println(l);
            l.print();
        }
    }
}
