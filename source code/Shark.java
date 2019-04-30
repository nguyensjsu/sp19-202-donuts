import greenfoot.*;

/**
<<<<<<< HEAD
 * This class defines a shark. Sharks swim in the ocean and look to eat fish, but 
   can get caught by a hook.
 */
public class Shark extends Actor
=======
 * This class defines a shark. Sharks swim in the ocean and look to eat fish and turtles, but
  * can get caught by a hook.
 */


public class Shark extends Actor implements Subject
>>>>>>> efae10f3719b57ca82666378a47463eb4313538b
{


    private GreenfootImage image1;
<<<<<<< HEAD
    private GreenfootImage image2;

    private int fishsEaten;
    private int counter = 0;

    //methods omitte  
=======
    private Actor fish, turtle, hook;
    private World world;
    private GameMessage msg;

    private ArrayList<Observer> observers =  new ArrayList<Observer>();


>>>>>>> efae10f3719b57ca82666378a47463eb4313538b
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

<<<<<<< HEAD
        if (Greenfoot.isKeyDown("right"))
        {
            turn(6);
        }
=======
        if (Greenfoot.isKeyDown("right"))  turn(3);
    }

    /**
     * Check whether we have stumbled upon a hook
     * If we have, end game
     */
    public void ifTouchHook()
    {
      hook = getOneIntersectingObject(Hook.class);
      if(hook != null)
      {
          Greenfoot.playSound("au.wav");
          Greenfoot.playSound("hawk_screeching.wav");
          getWorld().removeObject(this); // remove shark and end game
          Greenfoot.stop();
      }
>>>>>>> efae10f3719b57ca82666378a47463eb4313538b
    }

    /**
     * Check whether we have stumbled upon a fish
     * If we have, eat it. if not, do nothing
     */
<<<<<<< HEAD
    public void lookForfish()
=======
    public void lookForFish()
    {
      fish = getOneIntersectingObject(Fish.class);
      if(fish != null)
      {
          Greenfoot.playSound("bite.wav");
          notifyObservers("fish", msg); // notify observers for updating score
          getWorld().removeObject(fish); //after fish is eaten, remove from the world
      }
    }

   // OBSERVER PATTERN
    public void attach(Observer obj)
    {
       observers.add(obj);
    }

    public void detach(Observer obj)
>>>>>>> efae10f3719b57ca82666378a47463eb4313538b
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

<<<<<<< HEAD
    public void switchImage()
=======
    public void notifyObservers(String item, GameMessage msg)
>>>>>>> efae10f3719b57ca82666378a47463eb4313538b
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

