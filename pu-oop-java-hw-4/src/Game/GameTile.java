package Game;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static java.awt.Color.*;

public class GameTile extends JFrame {
    public static final int FIELD_SIZE = 100;
    private int row;
    private int col;

    public GameTile(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void render(Graphics g) {
        boardGrid(g);
    }

    void boardGrid(Graphics g) {
        g.setColor(Color.black);
        for (int i = 0; i <= 700; i += 100) {
            for (int j = 20; j <= 720; j += 100) {
                g.drawRect(i, j, 100, 100);
            }
        }
    }

    public void greenTile(Graphics g) {
        g.setColor(GREEN);
        g.fillRect(600, 23, 99, 99);
        g.fillRect(100, 122, 99, 99);
        g.fillRect(500, 222, 99, 99);
        g.fillRect(100, 322, 99, 99);
        g.fillRect(300, 322, 99, 99);
        g.fillRect(600, 422, 99, 99);
        g.fillRect(200, 522, 99, 99);
        g.fillRect(600, 722, 99, 99);
    }

    public void blueTile(Graphics g) {
        g.setColor(BLUE);
        g.fillRect(400, 122, 99, 99);
        g.fillRect(700, 222, 99, 99);
        g.fillRect(0, 522, 99, 99);
        g.fillRect(700, 522, 99, 99);
        g.fillRect(400, 622, 99, 99);
    }

    private int randTiles() {
        Random random = new Random();
        int rand = random.nextInt(5);
        while (rand == 2) {
            rand = random.nextInt(5);
        }
        return rand;
    }
}
