
import greenfoot.*;


public class BottomPipe extends Actor
{
    boolean pointWasCounted = false;

    public void act()
    {
        move(-6);
        if (getX() <= 53 && !pointWasCounted)
        {
            MyWorld w = (MyWorld) getWorld();
            w.score++;
            pointWasCounted = true;
        }
        if (getX() < -100 == true)
        {
            getWorld().removeObject(this);
        }
    }
}
