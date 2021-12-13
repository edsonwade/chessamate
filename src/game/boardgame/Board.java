package game.boardgame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    /**
     * given a row and columns number
     *
     * @param row
     * @param columns
     * @return row and columns in pieces
     */
    public Piece piece(int row, int columns) {
        return pieces[row][columns];
    }

    /**
     *
     * @param position
     * @return pieces positions
     */
    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }


    public void placePiece(Piece piece ,Position position){
        pieces[position.getRow()][position.getColumn()] =piece;
        piece.position = position;
    }
    @Override
    public String toString() {
        return "Board{" +
                "rows=" + rows +
                ", columns=" + columns +
                '}';
    }
}
