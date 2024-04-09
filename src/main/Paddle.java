import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BrickBreakerPaddle extends JPanel implements KeyListener, ActionListener {
    private int paddleX = 200;
    private final int paddleY = 480;
    private final int paddleWidth = 100;
    private final int paddleHeight = 10;
    private Timer timer;

    public BrickBreakerPaddle() {
        addKeyListener(this);
        setFocusable(true);
        timer = new Timer(10, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(paddleX, paddleY, paddleWidth, paddleHeight);
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT && paddleX > 0) {
            paddleX -= 20;
        }
        if (key == KeyEvent.VK_RIGHT && paddleX < getWidth() - paddleWidth) {
            paddleX += 20;
        }
    }

    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Brick Breaker Paddle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BrickBreakerPaddle game = new BrickBreakerPaddle();
        frame.add(game);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}







//package main;
//public class Paddle {
    //private int x, y, width, height;

    //public Paddle() {
        //width = 60;
        //height = 10;
        //x = 170;
        //y = 540;
    }

    // Add getters and setters
}
