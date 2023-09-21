package BreakoutBallGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GamePlay extends JPanel implements KeyListener, ActionListener {
    private final int ballMinX = 120;  // Minimum x value for ball's initial position
    private final int ballMaxX = 670;  // Maximum x value for ball's initial position
    private final int ballMinY = 50;   // Minimum y value for ball's initial position
    private final int ballMaxY = 350;  // Maximum y value for ball's initial position
    private int ballXDirection = -1;
    private int ballYDirection = -2;
    private Timer timer;
    private boolean play = false;
    private int score = 0;
    private int totalBricks = 21;
    private int delay = 8;
    private int playerX = 310;
    private int ballPositionX;
    private int ballPositionY;
    private MapGenerator mapGenerator;
    private Random random;

    public GamePlay() {
        mapGenerator = new MapGenerator(3, 7);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        timer = new Timer(delay, this);
        timer.start();

        random = new Random();
        do {
            ballPositionX = ballMinX + random.nextInt(ballMaxX - ballMinX + 1);
            ballPositionY = ballMinY + random.nextInt(ballMaxY - ballMinY + 1);
        } while (checkBallBrickCollision());

        play = true;
    }

    private boolean checkBallBrickCollision() {
        Rectangle ballRect = new Rectangle(ballPositionX, ballPositionY, 20, 20);

        for (int r = 0; r < mapGenerator.map.length; r++) {
            for (int c = 0; c < mapGenerator.map[0].length; c++) {
                if (mapGenerator.map[r][c] > 0) {
                    int brickX = c * mapGenerator.brickWidth + 80;
                    int brickY = r * mapGenerator.brickHeight + 50;
                    int brickWidth = mapGenerator.brickWidth;
                    int brickHeight = mapGenerator.brickHeight;

                    Rectangle brickRect = new Rectangle(brickX, brickY, brickWidth, brickHeight);

                    if (ballRect.intersects(brickRect)) {
                        return true; // Collision detected
                    }
                }
            }
        }

        return false; // No collision
    }


    public void paint(Graphics g) {
        // Background
        g.setColor(Color.black);
        g.fillRect(1, 1, 692, 592);

        // Draw MapGenerator (Bricks)
        mapGenerator.draw((Graphics2D) g);

        // Borders
        g.setColor(Color.green);
        g.fillRect(0, 0, 3, 592);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(683, 0, 3, 592);

        // Scores
        g.setColor(Color.cyan);
        g.setFont(new Font("serif", Font.BOLD, 25));
        g.drawString("Score: " + score, 570, 30);

        // Paddle
        g.setColor(Color.green);
        g.fillRect(playerX, 550, 100, 8);

        // Ball
        g.setColor(Color.orange);
        g.fillOval(ballPositionX, ballPositionY, 20, 20);

        if (ballPositionY > 570) {
            ballPositionY = 571;
            play = false;
            ballXDirection = 0;
            ballYDirection = 0;

            // Clear board and repaint background and borders
            g.setColor(Color.black);
            g.fillRect(1, 1, 692, 592);

            g.setColor(Color.red);
            g.fillRect(0, 0, 3, 592);
            g.fillRect(0, 0, 692, 3);
            g.fillRect(683, 0, 3, 592);

            // Game over
            g.setColor(Color.yellow);
            g.setFont(new Font("serif", Font.BOLD, 25));
            g.drawString("GAME OVER!! Score: " + score, 200, 300);

            // Restart
            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString("Press ENTER to restart", 225, 350);

            // Restart
            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString("or ESC to exit", 255, 380);
        }

        g.dispose();
    }

    @Override // ActionListener
    public void actionPerformed(ActionEvent e) {
        timer.start();

        if (play) {
            if (new Rectangle(ballPositionX, ballPositionY, 20, 20).intersects(new Rectangle(playerX, 550, 100, 8))) {
                if (ballYDirection > 0) {
                    ballYDirection = -ballYDirection; // Bounce off the paddle
                }
            }

            MapGeneratorForLoop:
            for (int r = 0; r < mapGenerator.map.length; r++) {
                for (int c = 0; c < mapGenerator.map[0].length; c++) {
                    if (mapGenerator.map[r][c] > 0) {
                        int brickX = c * mapGenerator.brickWidth + 80;
                        int brickY = r * mapGenerator.brickHeight + 50;
                        int brickWidth = mapGenerator.brickWidth;
                        int brickHeight = mapGenerator.brickHeight;

                        Rectangle rectangle = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                        Rectangle ballRectangle = new Rectangle(ballPositionX, ballPositionY, 20, 20);
                        Rectangle brickRectangle = rectangle;

                        if (ballRectangle.intersects(brickRectangle)) {
                            mapGenerator.setBrickValue(0, r, c);
                            totalBricks--;
                            score += 5;

                            if (ballPositionX + 19 <= brickRectangle.x || ballPositionX + 1 >= brickRectangle.x + brickRectangle.width) {
                                ballXDirection = -ballXDirection;
                            } else {
                                ballYDirection = -ballYDirection;
                            }
                            break MapGeneratorForLoop;
                        }
                    }
                }
            }

            ballPositionX += ballXDirection; // X
            ballPositionY += ballYDirection; // Y
            if (ballPositionX < 0) {
                ballXDirection = -ballXDirection;
            }
            if (ballPositionY < 0) {
                ballYDirection = -ballYDirection;
            }
            if (ballPositionX > 670) {
                ballXDirection = -ballXDirection;
            }
        }
        repaint();
    }

    @Override // KeyListener
    public void keyTyped(KeyEvent e) {

    }

    @Override // KeyListener
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            moveRight();
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            moveLeft();
        }
        if (!play && e.getKeyCode() == KeyEvent.VK_ENTER) {
            // Restart the game
            play = true;
            random = new Random();
            ballPositionX = ballMinX + random.nextInt(ballMaxX - ballMinX + 1);
            ballPositionY = ballMinY + random.nextInt(ballMaxY - ballMinY + 1);
            ballXDirection = -1;
            ballYDirection = -2;
            score = 0;
            totalBricks = 21;
            mapGenerator = new MapGenerator(3, 7);
            repaint();
        }
        if (!play && e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            // Exit the game
            JFrame jFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            jFrame.dispose();
        }
    }

    private void moveRight() {
        if (playerX >= 600) {
            playerX = 600;
        } else {
            play = true;
            playerX += 20;
        }
    }

    private void moveLeft() {
        if (playerX <= 10) {
            playerX = 10;
        } else {
            play = true;
            playerX -= 20;
        }
    }

    @Override // KeyListener
    public void keyReleased(KeyEvent e) {

    }
}
