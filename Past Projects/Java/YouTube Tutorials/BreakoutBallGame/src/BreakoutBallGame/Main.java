package BreakoutBallGame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        GamePlay gamePlay = new GamePlay();
        jFrame.setBounds(10, 10, 700, 600);
        jFrame.setTitle("Breakout Ball");
        jFrame.setResizable(false);
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null );
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(gamePlay);
        jFrame.addKeyListener(gamePlay);
    }
}