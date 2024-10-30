package main;

import objects.OBJ_CANDY;
import objects.OBJ_CHEST;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {
        gp.obj[0] = new OBJ_CANDY();
        gp.obj[0].worldX = 18 * gp.tileSize;
        gp.obj[0].worldY = 3 * gp.tileSize;

        gp.obj[1] = new OBJ_CHEST();
        gp.obj[1].worldX = 6 * gp.tileSize;
        gp.obj[1].worldY = 5 * gp.tileSize;
    }

}