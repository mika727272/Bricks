import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.Rectangle;
import java.awt.Color;

public class Paddle {
    private int x, y;
    private int velX = 0;
    private final int SPEED = 5;
    private final int WIDTH = 100, HEIGHT = 10;

    public Paddle() {
        x = 200;
        y = 350;
    }

    public void move() {
        x += velX;
        if (x < 0) {
            x = 0;
        } else if (x > 400 - WIDTH) {
            x = 400 - WIDTH;
        }
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            velX = -SPEED;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            velX = SPEED;
        }
    }

    public void keyReleased(KeyEvent e) {
        velX = 0;
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, WIDTH, HEIGHT);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, WIDTH, HEIGHT);
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
