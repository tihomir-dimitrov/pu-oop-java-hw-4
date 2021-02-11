package Game;

import StartPiece.Piece;
import WindowMessage.WindowMessage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameBoard extends JFrame implements MouseListener {
    private Piece selectedPiece;
    private Piece[][] PieceCollection;

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
                tile.Piece(g);
                tile.render(g);
                this.renderGamePiece(g, row, col);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int row = this.getBoardDimention(e.getY());
        int col = this.getBoardDimention(e.getX());

        if (this.selectedPiece != null) {

            Piece p = this.selectedPiece;

            if (p.isMoveValid(row, col)) {

                movePiece(row, col, p);
                this.repaint();
                return;
            }
        } else {

            WindowMessage.render(this, "Внимание", "Недостъпен GPS координат");
            return;
        }

        if (this.hasBoardPiece(row, col)) {
            this.selectedPiece = (Piece) this.getBoardPiece(row, col);
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

    private void movePiece(int row, int col, Piece p) {

        int initialRow = p.getRow();
        int initialCol = p.getCol();

        p.Movements(row, col);

        this.PieceCollection[p.getRow()][p.getCol()] = this.selectedPiece;
        this.PieceCollection[initialRow][initialCol] = null;
        this.selectedPiece = null;
    }

    private int getBoardDimention(int Placements) {
        return Placements / GameTile.FIELD_SIZE;
    }

    private boolean hasBoardPiece(int row, int col){
        return this.getBoardPiece(row, col) != null;
    }

    private Object getBoardPiece(int row, int col) {
        return this.PieceCollection[row][col];
    }

    private void renderGamePiece(Graphics g, int row, int col) {

        if (this.hasBoardPiece(row, col)) {

            Piece p = (Piece) this.getBoardPiece(row, col);
            p.render(g);
        }
    }
}
