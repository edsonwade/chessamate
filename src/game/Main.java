package game;

import game.boardgame.BoardException;
import game.chess.CheckException;
import game.chess.ChessMatch;

public class Main {
    public static void main(String[] args) throws CheckException, BoardException {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
