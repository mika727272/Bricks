package brickgame;

import java.sql.*;

public class HighScoreManager {
    public void saveScore(String playerName, int score) {
        String sql = "INSERT INTO HighScores (player_name, score) VALUES (?, ?)";
        try (Connection conn = DatabaseConnector.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, playerName);
            pstmt.setInt(2, score);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error saving score: " + e.getMessage());
        }
    }

    public void printHighScores() {
        String sql = "SELECT * FROM HighScores ORDER BY score DESC";
        try (Connection conn = DatabaseConnector.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                System.out.println(rs.getString("player_name") + ": " + rs.getInt("score"));
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving scores: " + e.getMessage());
        }
    }
}
