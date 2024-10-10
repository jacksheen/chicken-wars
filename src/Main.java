// Created by AtomicBolts
// Credits to this guy: https://www.youtube.com/watch?v=om59cwR7psI

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Chicken Wars");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel)

        window.pack()

        window.setLocationRelativeTo(null);
        window.setVisible(true);

    }
}