package com.softserve.edu12_Exсeptions.PracticalTasks.Plants;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String color, String type) throws ColorException, TypeException{
        this.size = size;
        this.color = colorStringToEnum(color);
        this.type = typeStringToEnum(type);
    }

    @Override
    public String toString() {
        return "\nPlant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }

    public static Color colorStringToEnum(String color) throws ColorException{
        Color color1;
        switch (color.toLowerCase()){
            case "red" -> color1 = Color.RED;
            case "white" -> color1 = Color.WHITE;
            case "blue" -> color1 = Color.BLUE;
            case "green" -> color1 = Color.GREEN;
            case "pink" -> color1 = Color.PINK;
            case "yellow" -> color1 = Color.YELLOW;
            default -> throw new ColorException("Color "+color+" hasn't definition");
        }

        return color1;
    }

    public static Type typeStringToEnum(String type) throws TypeException{
        Type type1;
        switch (type.toLowerCase()){
            case "rose" -> type1 = Type.ROSE;
            case "tulip" -> type1 = Type.TULIP;
            default -> throw new TypeException("Type "+type+" hasn't definition");
        }

        return type1;
    }
}
