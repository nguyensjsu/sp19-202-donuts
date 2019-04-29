import greenfoot.*;
import java.util.ArrayList;
/**
 * This class defines a shark. Sharks swim in the ocean and look to eat fish and turtles, but
  * can get caught by a hook.
 */


public class Shark extends Actor implements Subject
{

    private GreenfootImage image1;
    private Actor fish, turtle, hook;
    private World world;
    private GameMessage msg;

    private ArrayList<Observer> observers =  new ArrayList<Observer>();

    public Shark()
    {
        world = getWorld();
        GreenfootImage image1 = new GreenfootImage("Shark-1.png");
        setImage(image1);
    }

    public void act()
    {
       msg = (GameMessage) getWorld().getObjects(GameMessage.class).get(0);
       move(2);
       lookForFish() ;
       ifTouchHook();
       checkKeyPress();
    }

    public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("left"))  turn(-3);

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
    }

    /**
     * Check whether we have stumbled upon a fish
     * If we have, eat it. if not, do nothing
     */
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
    {
       observers.remove(obj);
    }

    public void notifyObservers(String item, GameMessage msg)
    {
        for(Observer obj : observers)
        {
            obj.update(item, msg);
        }
    }
}

