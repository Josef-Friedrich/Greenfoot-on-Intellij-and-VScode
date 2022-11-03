import greenfoot.*;

public class MyWorld extends World
{
    int frameNumber = 0;
    int score = 0;

    public MyWorld()
    {
        super(1536, 768, 1, false);

        addObject(new Clouds(), getWidth() / 2, 384);
        addObject(new Clouds(), getWidth() / 2 + getWidth(), 384);

        addObject(new Mountains(), getWidth() / 2, 384);
        addObject(new Mountains(), getWidth() / 2 + getWidth(), 384);

        addObject(new Ground(), getWidth() / 2, 384);
        addObject(new Ground(), getWidth() / 2 + getWidth(), 384);

        setPaintOrder(FlappyBird.class, Ground.class, TopPipe.class, BottomPipe.class,
                        Mountains.class, Clouds.class);

        addObject(new FlappyBird(), 200, 384);
    }

    public void act()
    {
        if (frameNumber % 120 == 0)
        {
            addPipes();
        }
        frameNumber++;
        showText("Score " + score, 100, 100);
    }

    public void addPipes()
    {
        int pipeHeight = getRandomNumber(145, 520);
        addObject(new TopPipe(), 2000, pipeHeight - 500);
        addObject(new BottomPipe(), 2000, pipeHeight + 500);

    }

    public int getRandomNumber(int start, int end)
    {
        int normal = Greenfoot.getRandomNumber(end - start + 1);
        return normal + start;
    }
}
