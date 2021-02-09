package Game;

import StartPiece.StartingTile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameBoard extends JFrame implements MouseListener {
    private Object ChosenPieces;
    private Object[][] PieceCollection;
    public static int madeMoves = 0;


    public GameBoard() {
        this.setSize(800, 800);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                GameTile tile = new GameTile(row, col);
                tile.greenTile(g);
                tile.blueTile(g);
                tile.boardGrid(g);
                this.renderGamePiece(g, row, col);
                StartingTile s1 = new StartingTile(row, col);
                s1.render(g);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int row = this.getBoardDimention(e.getY());
        int col = this.getBoardDimention(e.getX());

        if (this.isFull(row, col)) {
            this.ChosenPieces = this.getPiece(row, col);
        }
    }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    private void movePiece(int row, int col, StartingTile s1) {

        int initialRow = s1.getRow();
        int initialCol = s1.getCol();

        s1.Movements(row, col);

        this.PieceCollection[s1.getRow()][s1.getCol()] = this.ChosenPieces;
        this.PieceCollection[initialRow][initialCol] = null;

        this.ChosenPieces = null;
    }

    private int getBoardDimention(int Placements) {
        return Placements / GameTile.FIELD_SIZE;
    }

    private boolean isFull(int row, int col){
        return this.getPiece(row, col) != null;
    }

    private Object getPiece(int row, int col) {
        return this.PieceCollection[row][col];
    }
    private void renderGamePiece(Graphics g, int row, int col) {

        if(this.isFull(row, col)) {

            GameBoard g1 = (GameBoard) this.getPiece(row, col);
            g1.render(g);
        }
    }

    private void render(Graphics g) {
    }
}
