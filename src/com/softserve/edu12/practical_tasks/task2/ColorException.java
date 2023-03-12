package com.softserve.edu12.practical_tasks.task2;

public class ColorException extends Exception {
    public static void possibleColor(Color color) throws ColorException {

        if (color != Color.GREEN | color != Color.BLUE) {
            throw new ColorException();
        }


    }

}
