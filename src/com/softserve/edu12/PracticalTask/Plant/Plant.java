package com.softserve.edu12.PracticalTask.Plant;

public class Plant {
    int size;
    Color color;
    Type type;

    public Plant(int size, String color, String type) throws ColorException, TypeException{
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.type = t;
        this.color = c;
    }

    private Color colorStrToEnum(String color) throws ColorException{
        return switch (color.toLowerCase()) {
            case "green" -> Color.GREEN;
            case "blue" -> Color.BLUE;
            case "white" -> Color.WHITE;
            case "purple" -> Color.РURPLE;
            case "pink" -> Color.PINK;
            default -> throw new ColorException("There is no such color");
        };
    }

    private static Type typeStrToEnum(String type) throws TypeException {
        return switch (type.toLowerCase()) {
            case "rose" -> Type.ROSE;
            case "tulip" -> Type.TULIP;
            case "daisy" -> Type.DAISY;
            case "iris" -> Type.IRIS;
            case "jasmine" -> Type.JASMINE;
            default -> throw new TypeException("There is no such flower");
        };
    }


    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
