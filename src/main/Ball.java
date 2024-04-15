import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;

public class Ball {
    private int x, y;
    private int velX = 2, velY = 2;
    private final int SIZE = 15;

    public Ball() {
        x = 200;
        y = 200;
    }

    public void move() {
        x += velX;
        y += velY;
        if (x < 0 || x > 400 - SIZE) {
            velX = -velX;
        }
        if (y < 0 || y > 400 - SIZE) {
            velY = -velY;
        }
    }

    public void checkCollision(Paddle paddle, Brick[] bricks) {
        Rectangle ballRect = getBounds();
        Rectangle paddleRect = paddle.getBounds();
        if (ballRect.intersects(paddleRect)) {
            velY = -velY;
        }
        for (Brick brick : bricks) {
            if (!brick.isDestroyed() && ballRect.intersects(brick.getBounds())) {
                brick.setDestroyed(true);
                velY = -velY;
            }
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, SIZE, SIZE);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, SIZE, SIZE);
    }
}




//import java.awt.*;

//package main;
//public class Ball {
    //private int x, y, size;

    //public Ball() {
        //size = 20;
        //x = 190;
        //y = 490;
    }

    // Add getters and setters
}

//public Ball(int x, int y, int width, int height, Color color) {
		//super(x, y, width, height, color);
		//setOnScreen(true);
