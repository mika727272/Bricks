package main;
import javax.swing.JPanel;

public class Board extends JPanel {
    private Paddle paddle;
    private Ball ball;
    private Brick brick;

    public Board() {
        paddle = new Paddle();
        ball = new Ball();
        brick = new Brick();
    }
}