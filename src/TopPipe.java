
import greenfoot.*;

public class TopPipe extends Actor
{

    public void act()
    {
        move(-6);
        if (getX() < -1000 == true)
        {
            getWorld().removeObject(this);
        }
    }

    public TopPipe()
    {
        getImage().mirrorVertically();
    }
}
