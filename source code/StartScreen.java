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
        Level1Game startGame = new Level1Game(this);
        addObject(startGame,100,350);
        ExitGame exitGame = new ExitGame(this);
        addObject(exitGame,500,350);

        Level2Game level2 = new Level2Game(this);
        addObject(level2,288,353);
    }

    public void startGame() 
    {
        //Greenfoot.playSound("StartsScreen.wav");
       // Greenfoot.delay(310);
        Greenfoot.setWorld(new SharkWorld());
    }
    
    public void exitGame() 
    {
        System.exit(0);
    }
}
