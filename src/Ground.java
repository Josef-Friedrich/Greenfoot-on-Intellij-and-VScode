
import greenfoot.*;

public class Ground extends Background
{
    public Ground()
    {
        super(-6);
        GreenfootImage img = new GreenfootImage("layer-3-ground.png");
        img.scale(1536, 768);
        setImage(img);
    }
}
