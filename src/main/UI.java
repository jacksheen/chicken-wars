package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import objects.OBJ_CANDY;

public class UI {

    GamePanel gp;
    Font NESFont_30;
    BufferedImage candyImage;
    public boolean messageOn = false;
    public String message = "";

    public UI(GamePanel gp) {
        this.gp = gp;

        NESFont_30 = new Font("Nintendo NES Font", Font.PLAIN, 30);
        OBJ_CANDY candy = new OBJ_CANDY();
        candyImage = candy.image;
    }

    public void showMessage(String text) {
        message = text;
        messageOn = true;
    }

    public void draw(Graphics2D g2) {

        g2.setFont(NESFont_30);
        g2.setColor(Color.WHITE);
        g2.drawImage(candyImage, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);
        g2.drawString("x" + gp.player.hasCandy, 74, 65 );
        if (gp.debug == true) {
            g2.drawString("FPS:" + gp.FPS, 560, 65 );
        }
    }

}
