/*  
    Created by AtomicBolts

    Credits to Ryisnow,
    Watch his Java tutorials!
    https://www.youtube.com/watch?v=om59cwR7psI
*/

package main; 

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        ImageIcon icon = new ImageIcon("src/logo.png");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);
        window.setTitle("Chicken Wars");
        window.setIconImage(icon.getImage());

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.setupGame();
        gamePanel.startGameThread();

    }
}