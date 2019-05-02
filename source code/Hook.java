import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Hooks look to capture sharks. If a hook touches a shark the shark is captured and the game is ended.
 * @version (a version number or a date)
 */
public class Hook extends Objects

{
    private Actor shark;
    /**
     * Act - do whatever the Hook wants to do. This method is called whenever
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
          turn(15);
    } 
	
    public void randomTurn()
    {
        if ( Greenfoot.getRandomNumber(100)<10)
          turn( Greenfoot.getRandomNumber(90)-45 ); 
    }
} 