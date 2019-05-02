import greenfoot.*;

/**
 * This class defines a shark. Sharks swim in the ocean and look to eat fish, but
    * can get caught by a hook.
 */
public class Shark extends Actor
{

    private GreenfootImage image1;
    private GreenfootImage image2;

    private int fishsEaten;
    private int counter = 0;

    //methods omitte
    public Shark()
    {
        image1 = new GreenfootImage("Shark-1.png");
        image2 = new GreenfootImage("Shark-3.png");
        setImage(image1);
        fishsEaten=0;
    }

    public void act()
    {
        move(5) ;
        lookForfish();
        checkKeyPress();
        switchImage();
    }

    public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn (-6);
        }

        if (Greenfoot.isKeyDown("right"))
        {
            turn(6);
        }
    }

    /**
     * Check whether we have stumbled upon a fish
     * If we have, eat it. if not, do nothing
     */
    public void lookForfish()
    {

        if ( isTouching(fish.class) )
        {
            removeTouching(fish.class);
            Greenfoot.playSound("bite.wav");

            fishsEaten = fishsEaten + 1;
            if (fishsEaten == 8)
            {
                Greenfoot.playSound("champions.wav");
                Greenfoot.stop();
            }
        }
    }

    public void switchImage()
    {
        counter ++;
        if (counter == 4)
        {
            if (getImage () == image1)
            {
                setImage(image2);
            }
            else
            {
                setImage(image1);
            }
            counter = 0;
        }
    }
}

