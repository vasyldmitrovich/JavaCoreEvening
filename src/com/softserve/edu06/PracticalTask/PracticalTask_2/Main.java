package com.softserve.edu06.PracticalTask.PracticalTask_2;

public class Main {
    public static void main(String[] args) {
        Line[] lines = {
                new ColorLine(new Point(1,3), new Point(2,4),"Blue"),
                new Line(new Point(5,7), new Point(6,8)),
                new Line(new Point(9,11), new Point(10,12)),
                new ColorLine(new Point(13,15), new Point(14,16),"Red"),
                new Line(new Point(17,19), new Point(18,20)),
        };
        for (Line line : lines) {
            line.print(line);
        }
    }
}
