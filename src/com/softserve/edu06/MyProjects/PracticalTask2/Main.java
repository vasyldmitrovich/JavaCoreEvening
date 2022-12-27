package com.softserve.edu06.MyProjects.PracticalTask2;

import java.util.ArrayList;
/*Roman Sitko. Lesson 6, PracticalTask2;
* */
public class Main {
    public static void main(String[] args) {
        Main.run();

    }
    //Method from Vasyl
    public static void run() {
        ArrayList<Line> lines = new ArrayList<>();
        lines.add(new Line(new Point(1, 1), new Point(3, 2)));

        lines.add(new ColorLine(new Point(1, 7), new Point(3.5, -2.4), "red"));
        lines.add(new ColorLine(new Point(9, 4), new Point(5, -4.6), "black"));

        lines.add(new Line(new Point(1, 3), new Point(3, 9)));
        lines.add(new Line(new Point(1.8, 3.1), new Point(6.3, 2.8)));
        for (Line line : lines) {
            line.print();
        }
    }

    /*The first version is good, second version you should not write*/
    //My version method. Use simple array.
    /*
    public static void run() {

        Line[] lines = new Line[2];
        lines[0] = new Line(new Point(2, 2), new Point(3,4));
        lines[1] = new ColorLine(new Point(2.1, 4.1), new Point(3.2, 4.2), "red");

        for (Line line : lines) {
            line.print();
        }
    }
    */
}
