package Practical.task2;
/*Create three classes:
        - Point with attributes x and y
        - Line which contains two object of Point class
- ColorLine with attributes Color which extends Line class.
        Override method toString() and define method print() in every classes
        In main() method create array of Line and add some Line and ColorLine to it.
        Call method print() for all of it.*/



public class Main {
    public static void main(String[] args) {

        Line[] lines =new Line[5];
        lines[0]= new Line(new Point(10,10),new Point(14,14));
        lines[1]= new ColorLine(new Point(17,17),new Point(21,21), "blue");
        lines[2]= new ColorLine(new Point(166,166),new Point(42,42), "red");
        lines[3]= new Line(new Point(14,15),new Point(67,72));
        lines[4]= new Line(new Point(66,98),new Point(48,102));

        for (Line l:lines){
            l.print();
        }
    }
}
