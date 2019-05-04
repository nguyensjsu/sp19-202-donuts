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
        Level1Game level1 = new Level1Game(this);
        addObject(level1,100,350);
        Level2Game level2 = new Level2Game(this);
        addObject(level2,300,350);
        Level3Game level3 = new Level3Game(this);
        addObject(level3,500,350);

       //
       // addObject(level2,288,353);
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
