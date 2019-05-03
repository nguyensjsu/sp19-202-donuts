import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{
    
    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {  
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Greenfoot.start();
        Greenfoot.setWorld(this);
        prepare();
    }
    
    private void prepare()
    {
        GameTitle gameTitle = new GameTitle();
        addObject(gameTitle,300,150);
        StartGame startGame = new StartGame(this);
        addObject(startGame,300,350);
 
    }
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("enter"))
           startGame();
    }
    
    public void startGame()
    {
        Greenfoot.playSound("StartsScreen.wav");
        Greenfoot.delay(310);
        Greenfoot.setWorld(new SharkWorld());
    }
 
}
