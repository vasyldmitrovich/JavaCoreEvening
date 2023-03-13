package com.softserve.edu12.practical_tasks.task2;

import java.io.IOException;

public class ColorException {
    public static Color possibleColor(Color color) throws IOException {

        if (color != Color.GREEN & color != Color.BLUE & color != Color.YELLOW & color != Color.PINK) {
            throw new IOException("Forbidden color!");
        }
        return color;

    }

}
