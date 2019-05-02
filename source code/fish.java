import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Fish swim around the screen while the player (shark) tries to eat them. When 8 fish are eaten the 
 * game is won
 * @version (a version number or a date)
 */
public class fish extends Actor
{
    /**
     * Act - do whatever the fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        randomTurn();
        move(3) ;
        turnAtEdge();
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
        if ( Greenfoot.getRandomNumber(100) < 10)
        {
            turn( Greenfoot.getRandomNumber(90)-45 ); 
        }
    }
}    

