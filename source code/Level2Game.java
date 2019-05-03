import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2Game extends GameControls
{
    World w = null;
    
    public Level2Game(World w) 
    {
        this.w = w;
      
    }
    
    public void act() 
    {
        
        if (Greenfoot.mouseClicked(this)){  
             SharkWorld.gamelevel=2;
            ((StartScreen)w).startGame();
             
            
        }
       
    }      
}
