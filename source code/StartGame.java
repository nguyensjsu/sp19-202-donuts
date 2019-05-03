import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartGame extends GameControls

{
    World w = null;
    
    public StartGame(World w) {
        this.w = w;
    }
    
    /**
     * Act - do whatever the StartGame button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
           
            ((StartScreen)w).startGame();
        }
    }     
}
