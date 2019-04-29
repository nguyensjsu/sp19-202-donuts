import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Fish swim around the screen while the player (shark) tries to eat them.
 * @version (a version number or a date)
 */
public class Fish extends Objects
{
    /**
     * Act - do whatever the fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        randomTurn();
        move(1) ;
        turnAtEdge();
    }

    public void turnAtEdge()
    {
        if ( isAtEdge() )
          turn(8);
    }

    public void randomTurn()
    {
        if ( Greenfoot.getRandomNumber(800) < 10)
          turn( Greenfoot.getRandomNumber(100)-45 );
    }
}

