
import greenfoot.*;

public class Background extends Actor
{
    int moveX;

    public void act()
    {
        move(moveX);
        int w = getWorld().getWidth();
        if (getX() <= -w / 2)
        {
            setLocation(w / 2 + w, 384);
        }
    }

    public Background(int moveX)
    {
        this.moveX = moveX;
    }
}
