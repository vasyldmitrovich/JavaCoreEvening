package com.softserve.edu12.MyProjects.PracticalTask2;

public class Plant {

    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String color, String type) throws ColorException, TypeException, SizeException {
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        int s = checkSize(size);
        this.size = s;
        this.color = c;
        this.type = t;
    }

    //add own method
    private int checkSize(int size) throws SizeException {
        if(size < 0) {
            throw new SizeException("Size should be positive integer number");
        } else {
            return size;
        }
    }

    private Color colorStrToEnum(String color) throws ColorException {
        switch(color.toLowerCase()){
            case "blue" : return Color.Blue;
            case "red" : return Color.Red;
            case "white" : return Color.White;
            default : throw new ColorException("Input only color blue, red or white");
        }
    }

    private Type typeStrToEnum(String type) throws TypeException {
        switch(type.toLowerCase()){
            case "herbs" : return Type.Herbs;
            case "climbers" : return Type.Climbers;
            case "trees" : return Type.Trees;
            default : throw new TypeException("Input only type herbs, climbers, trees;");
        }
    }

        @Override
    public String toString() {
        return "Plant: {size: " + size +
                ", color: " + color +
                ", type: " + type + "}" + "\n";
    }
}
