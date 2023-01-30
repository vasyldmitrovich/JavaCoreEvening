package Practical.task2;
/*Create three classes:
        - Point with attributes x and y
        - Line which contains two object of Point class
- ColorLine with attributes Color which extends Line class.
        Override method toString() and define method print() in every classes
        In main() method create array of Line and add some Line and ColorLine to it.
        Call method print() for all of it.*/
public class ColorLine extends Line{
    String color;

    public ColorLine(Point p1, Point p2, String color) {
        super(p1, p2);
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println(this + " "+super.toString());
    }

    @Override
    public String toString() {
        return "ColorLine color= " + color;
    }
}
