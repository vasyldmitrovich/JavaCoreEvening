package com.softserve.edu06.PracticalTasks.Line;

public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(new Point(2, 3), new Point(3,4));
        Line line2 = new Line(new Point(12, 14), new Point(15,18));
        ColorLine colorLine1 = new ColorLine(new Point(6, 7), new Point(8,9), "red");
        ColorLine colorLine2 = new ColorLine(new Point(12, 14), new Point(18, 19), "black");

        Line[] lines = {line1, line2, colorLine1, colorLine2};

        for (Line line: lines) {
            System.out.println(line);
        }

    }
}
