package BreakoutBallGame;

import java.awt.*;

public class MapGenerator {
    public int map[][];
    public int brickWidth;
    public int brickHeight;


    public MapGenerator(int row, int column) {
        map = new int[row][column];

        for (int r = 0; r < map.length; r++) {
            for (int c = 0; c < map[0].length; c++) {
                map[r][c] = 1;
            }
        }
        brickWidth = 540 / column;
        brickHeight = 150 / row;
    }

    public void draw(Graphics2D g) {
        for (int r = 0; r < map.length; r++) {
            for (int c = 0; c < map[0].length; c++) {
                if (map[r][c] > 0) {
                    g.setColor(Color.white);
                    g.fillRect(c * brickWidth + 80, r * brickHeight + 50, brickWidth, brickHeight);

                    // Borders
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(c * brickWidth + 80, r * brickHeight + 50, brickWidth, brickHeight);
                }
            }
        }
    }

    public void setBrickValue(int value, int row, int column){
        map[row][column] = value;
    }
}
