package Game;

import javax.swing.*;
import java.awt.*;

public class GameBoard extends JFrame {
    public GameBoard() {
        this.setSize(800, 800);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                GameTile tile = new GameTile(row, col);
                setBackground(Color.PINK);
                tile.greenTile(g);
                tile.blueTile(g);
                tile.yellowTile(g);
            }
        }
    }
}
