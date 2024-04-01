package code;

public class Window extends javax.swing.JFrame {
    public Window(String title, int width, int height, Game game) {
        super(title);
        setSize(width, height);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        // Hozzáadjuk a játékot az ablakohoz
        add(game);
        // Láthatóvá lesz téve az ablak
        setVisible(true);
    }
}
