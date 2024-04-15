import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;

public class Brick {
    private int x, y;
    private int width, height;
    private boolean destroyed;

    public Brick(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.destroyed = false;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    public void draw(Graphics g) {
        if (!destroyed) {
            g.setColor(Color.GRAY);
            g.fillRect(x, y, width, height);
            g.setColor(Color.BLACK);
            g.drawRect(x, y, width, height); // Drawing the border
        }
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }
}




//*package main;

//*public class Brick {
   //* private int x, y, width, height;

  //*  public Brick() {
       //* width = 50;
      //*  height = 20;
      //*  x = 100;
      //*  y = 50;
