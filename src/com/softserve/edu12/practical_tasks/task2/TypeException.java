package com.softserve.edu12.practical_tasks.task2;

import java.io.IOException;

public class TypeException {
    public static Type possibleType(Type type) throws IOException {

        if (type != Type.TREE & type != Type.WEED & type != Type.GRASS & type != Type.COR) {
            throw new IOException("Forbidden type!");
        }
        return type;

    }
}
