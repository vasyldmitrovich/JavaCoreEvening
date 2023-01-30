package Practical.task2;
/*Create three classes:
        - Point with attributes x and y
        - Line which contains two object of Point class
- ColorLine with attributes Color which extends Line class.
        Override method toString() and define method print() in every classes
        In main() method create array of Line and add some Line and ColorLine to it.
        Call method print() for all of it.*/

public class Line {
    Point p1,p2;


    public Line(Point p1, Point p2){
        this.p1=p1;
        this.p2=p2;
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Line " +
                "point 1: " + p1.toString() +
                ",point 2: " + p2.toString();
    }
}
