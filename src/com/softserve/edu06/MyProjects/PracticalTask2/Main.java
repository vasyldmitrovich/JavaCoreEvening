package com.softserve.edu06.MyProjects.PracticalTask2;

public class Main {
    public static void main(String[] args) {
        Line[] lines = new Line[1];
        lines[0] = new Line(new Point(2, 2), new Point(3,4));
        lines[0].print();

        Line color = new ColorLine("yellow");
        color.print();


    }
}
