package StartPiece;

import Game.GameBoard;

import java.awt.*;

public class StartingTile extends GameBoard {
    private int row;
    private int col;

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }

    public StartingTile(int row, int col){
        this.row = row;
        this.col = col;
    }
    public void Movements(int row, int col){
        this.row = row;
        this.col = col;
    }

    public boolean isMoveValid(int moveRow, int moveCol) {

        int rowCoefficient = Math.abs(moveRow - this.row);
        int colCoefficient = moveCol - this.col;

        return  rowCoefficient == 4 &&
                colCoefficient == 1;
    }

    public void render(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillRect(0, 722, 99, 99);
    }


}

