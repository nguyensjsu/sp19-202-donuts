import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Hooks look to capture sharks. If a hook touches a shark the shark is captured and the game is ended.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hook extends Actor
{
<<<<<<< HEAD
=======

    private Actor shark;
>>>>>>> efae10f3719b57ca82666378a47463eb4313538b
    /**
     * Act - do whatever the Hook wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        {
            randomTurn();
            move(2) ;
            lookForShark();
            turnAtEdge();
        }
    }

    public void turnAtEdge()
    {
        if ( isAtEdge() )
        {
            turn(17);
        }
    }

    public void randomTurn()
    {
<<<<<<< HEAD
        if ( Greenfoot.getRandomNumber(100) < 10)
        {
            turn( Greenfoot.getRandomNumber(90)-45 ); 
        }
    }

    /**
     * Check whether we have stumbled upon a Shark
     * If we have, eat it. if not, do nothing
     */
    public void lookForShark()
    {
        if ( isTouching(Shark.class) )
        {
            removeTouching(Shark.class);
            Greenfoot.playSound("loss.wav");
            Greenfoot.stop();

        }
=======
        if ( Greenfoot.getRandomNumber(800) < 10)
          turn( Greenfoot.getRandomNumber(100)-45 );
>>>>>>> efae10f3719b57ca82666378a47463eb4313538b
    }
}