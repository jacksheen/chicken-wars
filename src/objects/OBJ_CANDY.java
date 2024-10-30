package objects;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_CANDY extends SuperObject {

    public OBJ_CANDY() {

        name = "Candy";

        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/objects/lolli.png"));
        } catch(IOException e) {
            e.printStackTrace();
        }
        
        collision = true;
    }

}
