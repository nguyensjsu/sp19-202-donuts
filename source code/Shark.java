import greenfoot.*;

/**
 * This class defines a shark. Sharks swim in the ocean and look to eat fish, but
    * can get caught by a hook.
 */
public class Shark extends Actor
{

    public GreenfootImage image1;
    public GreenfootImage image2;

    public int fishsEaten;
    public int counter = 0;
    public int count = 1;

    //methods omitte
    public Shark()
    {
        image1 = new GreenfootImage("Shark-1.png");
        image2 = new GreenfootImage("Shark-3.png");
        setImage(image1);
        fishsEaten=0;
    }

    public  boolean isTouchingWrapper(java.lang.Class<?> cls) {
        return isTouching(cls);
    }

    public void removeTouchingWrapper(java.lang.Class<?> cls) {
        removeTouching(cls);
    }

}

