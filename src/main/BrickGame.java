import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;

public class BrickGame extends JFrame {
    private BrickBreakerBoard board;

    public BrickGame() {
        board = new BrickBreakerBoard();
        add(board);
        setTitle("Brick Breaker Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                board.paddle.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                board.paddle.keyReleased(e);
            }
        });
    }

    // Database operations for high scores
    private Connection connect() {
        String url = "jdbc:sqlite:path_to_your_database.db"; // Update this with your database path
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void insertHighScore(String player, int score) {
        String sql = "INSERT INTO high_scores(player, score) VALUES(?, ?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, player);
            pstmt.setInt(2, score);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Integer> getHighScores() {
        String sql = "SELECT score FROM high_scores ORDER BY score DESC LIMIT 10";
        ArrayList<Integer> scores = new ArrayList<>();

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            while (rs.next()) {
                scores.add(rs.getInt("score"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return scores;
    }

    public static void main(String[] args) {
        new BrickGame();
    }
}






//package main;
//import javax.swing.JFrame;
//import java.awt.*;


//public class BrickGame extends JFrame {
    /**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	//public BrickGame() {
        //setTitle("Brick Game");
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setSize(400, 600);
        //setLocationRelativeTo(null);
        //setResizable(false);

        //add(new Board());


    //public static void main(String[] args) {
        //new BrickGame();
 
