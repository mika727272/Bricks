package brickgame;

import javax.swing.JFrame;

public class Main {

public static void main(String[] args) {  //Játék futtatásához szükséges kódrendszer
JFrame obj = new JFrame();
Gameplay gameplay = new Gameplay();
obj.setBounds(10,10,700,600);
obj.setTitle("Bricks Brecker Játék");
obj.setResizable(false);
obj.setVisible(true);
obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
obj.add(gameplay);
}

}
