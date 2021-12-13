package game;

import game.chess.ChessPiece;

public class UI {

    public static void printBoard(ChessPiece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < pieces.length; j++) {
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println("   a   b   c   d   e   f   g   h ");
    }

    /**
     * print piece
     * @param piece
     */
    public static void printPiece(ChessPiece piece) {
        System.out.print((piece == null) ? " - " : piece);
        System.out.print(" ");
    }
}
