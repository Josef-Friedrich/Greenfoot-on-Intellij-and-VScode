
import greenfoot.*;

public class FlappyBird extends Actor
{
    int frameNumber = 1;
    int timer = 3;
    float changeY = 0;
    boolean spaceWasPressed = false;

    public void act()
    {
        drawBird();
        if (timer <= 0)
        {
            frameNumber++;
            if (frameNumber > 4)
            {
                frameNumber = 1;
            }
            timer = 3;
        }
        timer--;

        applyPhysics();
        controls();
        checkCollisions();
    }

    public void checkCollisions()
    {
        if (getY() >= 624)
        {
            Greenfoot.stop();

        }

        if (isTouching(BottomPipe.class) || isTouching(TopPipe.class))
        {
            Greenfoot.stop();
        }
    }

    public void applyPhysics()
    {
        // type casting float value changeY to int
        if (getY() + (int) changeY >= 44)
        {
            setLocation(getX(), getY() + (int) changeY);
            changeY += 0.5f;

        }
        else
        {
            changeY = 0;
        }
    }

    public void controls()
    {
        if (Greenfoot.isKeyDown("space") && !spaceWasPressed)
        {
            changeY = -8;
            spaceWasPressed = true;
        }
        if (!Greenfoot.isKeyDown("space"))
        {
            spaceWasPressed = false;
        }
        setRotation((int) changeY * 2);
    }

    public FlappyBird()
    {
        drawBird();
    }

    public void drawBird()
    {
        GreenfootImage img = new GreenfootImage("frame-" + frameNumber + ".png");
        img.scale(132, 116);
        setImage(img);
    }
}
