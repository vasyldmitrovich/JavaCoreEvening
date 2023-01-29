package com.softserve.Project.Chess;


import static com.softserve.Project.Chess.ChessBoard.outputBoard;

public class ChessGame {

    public static void main(String[] args) throws Exception {


        System.out.println("WELCOME TO THE CHESS GAME\nSTART GAME?");

        String scanner = new Methods().inPut();
        Piece[][] board = new ChessBoard().initialBoard();

        if (scanner.equalsIgnoreCase("yes")) {
            outputBoard(board);
            int a = 0;
            while (a < 200) {

                System.out.println("\n\n---------------------------");
                System.out.print("\nMake move:\n1) Choose figure:");
                String chooseFigure = new Methods().inPut();
                if (chooseFigure.equalsIgnoreCase("surrender")) {
                    System.out.println("You surrendered.\nSEE YOU LATER. BYE");
                    break;
                }

                System.out.print("2) Choose position:");
                String madeMove = new Methods().inPut();
                if (madeMove.equalsIgnoreCase("surrender")) {
                    System.out.println("You surrendered.\nSEE YOU LATER. BYE");
                    break;
                }

                Position chooseFigure1 = new Methods().position(chooseFigure);
                Position madeMove1 = new Methods().position(madeMove);

                outputBoard(new Methods().move(board, chooseFigure1, madeMove1));

                a++;
            }
        } else {
            System.out.println("SEE YOU LATER. BYE");
        }
    }
}
