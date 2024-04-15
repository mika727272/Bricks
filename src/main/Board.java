import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;

public class BrickBreakerBoard extends JPanel implements ActionListener {
    private Timer timer;
    private Paddle paddle;
    private Ball ball;
    private Brick[] bricks;

    public BrickBreakerBoard() {
        this.paddle = new Paddle();
        this.ball = new Ball();
        this.bricks = new Brick[21];  // Example with 21 bricks
        int brickWidth = 60;
        int brickHeight = 20;
        for (int i = 0; i < bricks.length; i++) {
            bricks[i] = new Brick((i % 7) * brickWidth + 40, (i / 7) * brickHeight + 50, brickWidth, brickHeight);
        }
        timer = new Timer(10, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        paddle.draw(g);
        ball.draw(g);
        for (Brick brick : bricks) {
            if (!brick.isDestroyed()) {
                brick.draw(g);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        ball.move();
        paddle.move();
        ball.checkCollision(paddle, bricks);
        repaint();
    }
}







//*package main;
//*import javax.swing.JPanel;

//*public class Board extends JPanel {
  //*  private Paddle paddle;
  //*  private Ball ball;
   //* private Brick brick;

   //* public Board() {
    //*    paddle = new Paddle();
    //*    ball = new Ball();
    //*    brick = new Brick(); 
 
