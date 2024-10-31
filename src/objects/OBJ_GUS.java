package objects;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_GUS extends SuperObject {

    public OBJ_GUS() {

        name = "Gus";

        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/objects/gus.png"));
        } catch(IOException e) {
            e.printStackTrace();
        }
        
        collision = true;
    }

}
