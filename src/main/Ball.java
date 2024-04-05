import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


//A Labda pozicíója
public class BrickBreakerBall extends JPanel implements ActionListener {
    private int ballX = 250;
    private int ballY = 250;
    private int ballXSpeed = 2;
    private int ballYSpeed = 3;


// A labda időlimitje	
    public BrickBreakerBall() {
        Timer timer = new Timer(20, this);
        timer.start();
    }

	//Labda színe
	
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.fillOval(ballX, ballY, 20, 20);
    }

//Labda Sebessége
	
    public void actionPerformed(ActionEvent e) {
        ballX += ballXSpeed;
        ballY += ballYSpeed;
        
        if (ballX <= 0 || ballX >= 240) {
            ballXSpeed = -ballXSpeed;
        }
        if (ballY <= 0 || ballY >= 240) {
            ballYSpeed = -ballYSpeed;
        }

        repaint();
    }

//A labda új játékban kezdene
	
    public static void main(String[] args) {
        JFrame frame = new JFrame("Brick Breaker Ball");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BrickBreakerBall game = new BrickBreakerBall();
        frame.add(game);
        frame.setSize(500, 500);
        frame.setVisible(true);
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
