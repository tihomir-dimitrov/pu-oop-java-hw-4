package Game;

import javax.swing.*;
import java.awt.*;

public class GameTile extends JFrame {
    private int row;
    private int col;
    private static final int FIELD_SIZE=100;

    public GameTile(int row, int col){
        this.row = row;
        this.col = col;
    }

    public void backGroundColor(Graphics g){
        setBackground(Color.PINK);
    }

    public void greenTile(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(600,0,100,100);
        g.fillRect(100,100,100,100);
        g.fillRect(500,200,100,100);
        g.fillRect(100,300,100,100);
        g.fillRect(300,300,100,100);
        g.fillRect(600,400,100,100);
        g.fillRect(200,500,100,100);
        g.fillRect(600,700,100,100);
    }

    public void blueTile(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(400,100,100,100);
        g.fillRect(700,200,100,100);
        g.fillRect(0,500,100,100);
        g.fillRect(700,500,100,100);
        g.fillRect(400,600,100,100);
    }

    public void yellowTile(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillRect(0,700,100,100);
    }
}
