package com.softserve.Project.Chess;

import java.util.Scanner;

public class Methods {

    public String inPut() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public Position position(String string) {
        return Position.valueOf(string.toUpperCase());
    }

    public Piece[][] move(Piece[][] pieces, Position figureCoordinates, Position move) {
        pieces[move.x()][move.y()] = pieces[figureCoordinates.x()][figureCoordinates.y()];
        pieces[figureCoordinates.x()][figureCoordinates.y()] = new Piece("-", figureCoordinates, "y");
        return pieces;
    }
}
