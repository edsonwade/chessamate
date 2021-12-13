package game.boardgame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) throws BoardException {
        if (rows < 1 || columns < 1) {
            throw new BoardException("Error creating board :there must be at least 1 row and 1 columns");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }


    public int getColumns() {
        return columns;
    }


    /**
     * given a row and columns number
     *
     * @param row
     * @param columns
     * @return row and columns in pieces
     */
    public Piece piece(int row, int columns) throws BoardException {
        if (!positionExists(row, columns)) {
            throw new BoardException("Position not in the Board");
        }
        return pieces[row][columns];
    }

    /**
     * @param position
     * @return pieces positions
     */
    public Piece piece(Position position) throws BoardException {
        if (!positionExists(position)) {
            throw new BoardException("Position not in the Board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }


    public void placePiece(Piece piece, Position position) throws BoardException {
        if(thereIsAPiece(position)){
            throw new BoardException("There is already ");
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    private boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());

    }

    public boolean thereIsAPiece(Position position) throws BoardException {
        if (!positionExists(position)) {
            throw new BoardException("Position not in the Board");
        }
        return piece(position) != null;

    }

    @Override
    public String toString() {
        return "Board{" +
                "rows=" + rows +
                ", columns=" + columns +
                '}';
    }
}
