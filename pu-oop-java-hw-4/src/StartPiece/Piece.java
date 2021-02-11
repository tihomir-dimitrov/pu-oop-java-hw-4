package StartPiece;

import Game.GameBoard;

import java.awt.*;

public class Piece extends GameBoard {
    private int row;
    private int col;

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Piece(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void Movements(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public boolean isMoveValid(int moveRow, int moveCol) {

        int rowCoefficient = Math.abs(moveRow - this.row);
        int colCoefficient = moveCol - this.col;

        return rowCoefficient == 8 &&
                colCoefficient == 1;
    }

    public void render(Graphics g) {
    }
}