package main;
import javax.swing.JFrame;
import java.awt.*;


public class BrickGame extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BrickGame() {
        setTitle("Brick Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        add(new Board());

        setVisible(true);
    }

    public static void main(String[] args) {
        new BrickGame();
    }
}
