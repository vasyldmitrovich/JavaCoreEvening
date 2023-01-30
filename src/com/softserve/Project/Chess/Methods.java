package com.softserve.Project.Chess;

import com.softserve.Project.Chess.Pieces.EmptySpace;

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
        for (Piece[] line : pieces) {
            for (Piece figure : line) {
                if (figure.position() == figureCoordinates) {
                    if (figure.canMove(figureCoordinates, move)) {
                        pieces[move.x()][move.y()] = pieces[figureCoordinates.x()][figureCoordinates.y()];
                        pieces[figureCoordinates.x()][figureCoordinates.y()] = new EmptySpace("-", figureCoordinates, "y");
                    } else {
                        System.err.println("TRY AGAIN.");
                    }
                    return pieces;
                }
            }
        }
        System.out.println("There are not a figure.");
        return pieces;
    }
}
