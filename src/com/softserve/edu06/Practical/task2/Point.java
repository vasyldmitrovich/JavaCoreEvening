package Practical.task2;
/*Create three classes:
        - Point with attributes x and y
        - Line which contains two object of Point class
- ColorLine with attributes Color which extends Line class.
        Override method toString() and define method print() in every classes
        In main() method create array of Line and add some Line and ColorLine to it.
        Call method print() for all of it.*/

public class Point {
    protected int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y;
    }
}
