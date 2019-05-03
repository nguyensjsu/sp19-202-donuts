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
        addObject(gameTitle,300,100);
        StartGame startGame = new StartGame(this);
        addObject(startGame,150,300);
        ExitGame exitGame = new ExitGame(this);
        addObject(exitGame,450,300);
        
    }
    
    public void act() {
        if(Greenfoot.isKeyDown("enter"))
            Greenfoot.setWorld(new SharkWorld());
    }
    
    public void startGame() {
        Greenfoot.setWorld(new SharkWorld());
    }
    
    public void exitGame() {
        System.exit(0);
    }
}
