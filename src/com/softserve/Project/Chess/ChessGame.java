package com.softserve.Project.Chess;


import com.softserve.Project.Chess.Pieces.Bishop;

import static com.softserve.Project.Chess.ChessBoard.outputBoard;

public class ChessGame {

    public static void main(String[] args) throws Exception {
        Piece[][] board = new ChessBoard().initialBoard();

        System.out.println("WELCOME TO THE CHESS GAME\nSTART GAME?");

        String scanner = new Methods().inPut();

        if (scanner.equalsIgnoreCase("yes")) {
            outputBoard(board);
            int a = 0;
            while (a < Integer.MAX_VALUE) {

                if (playerMove(board, "Player #1 (White)")) break;
                if (playerMove(board, "Player #2 (Black)")) break;

                a++;
            }
        } else {
            System.out.println("SEE YOU LATER. BYE");
        }
    }

    private static boolean playerMove(Piece[][] board, String player) {
        System.out.println("\n\n---------------------------");
        System.out.print("\n" + player + " move:\n1) Choose figure:");
        String chooseFigurePl2 = new Methods().inPut();
        if (chooseFigurePl2.equalsIgnoreCase("surrender")) {
            System.out.println(player + " surrendered.\nSEE YOU LATER. BYE");
            return true;
        } else if (chooseFigurePl2.equalsIgnoreCase("exit")) {
            System.out.println(player + " exit the game.\nSEE YOU LATER. BYE");
            return true;
        }

        System.out.print("2) Choose position:");
        String madeMovePl2 = new Methods().inPut();
        if (madeMovePl2.equalsIgnoreCase("surrender")) {
            System.out.println(player + " surrendered.\nSEE YOU LATER. BYE");
            return true;
        } else if (chooseFigurePl2.equalsIgnoreCase("exit")) {
            System.out.println(player + " exit the game.\nSEE YOU LATER. BYE");
            return true;
        }

        Position chooseFigurePL2 = new Methods().position(chooseFigurePl2);
        Position madeMovePL2 = new Methods().position(madeMovePl2);

        outputBoard(new Methods().move(board, chooseFigurePL2, madeMovePL2));
        return false;
    }
}
