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
    
    private int randTiles() {
        Random random = new Random();
        int rand = random.nextInt(8);
        while (rand == 2) {
            rand = random.nextInt(8);
        }
        return rand;
    }

    public void blueTile(Graphics g){

        int blueTile1 = randTiles();
        int blueTile2 = randTiles();
        int blueTile3 = randTiles();
        int blueTile4 = randTiles();
        int blueTile5 = randTiles();

        g.setColor(Color.BLUE);
        g.fillRect((blueTile1*100)+20,122, 99, 99);
        g.fillRect((blueTile2*100)+20,322, 99, 99);
        g.fillRect((blueTile3*100)+20,422, 99, 99);
        g.fillRect((blueTile4*100)+20,522, 99, 99);
        g.fillRect((blueTile5*100)+20,622, 99, 99);
    }

    public void greenTile(Graphics g){

        int greenTile1 = randTiles();
        int greenTile2 = randTiles();
        int greenTile3 = randTiles();
        int greenTile4 = randTiles();
        int greenTile5 = randTiles();
        int greenTile6 = randTiles();
        int greenTile7 = randTiles();
        int greenTile8 = randTiles();

        g.setColor(GREEN);
        g.fillRect((greenTile1*100)+20,23,99,99);
        g.fillRect((greenTile2*100)+20,123,99,99);
        g.fillRect((greenTile3*100)+20,223,99,99);
        g.fillRect((greenTile4*100)+20,323,99,99);
        g.fillRect((greenTile5*100)+20,423,99,99);
        g.fillRect((greenTile6*100)+20,523,99,99);
        g.fillRect((greenTile7*100)+20,623,99,99);
        g.fillRect((greenTile8*100)+20,723,99,99);
    }
}
