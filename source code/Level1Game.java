import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level1Game extends GameControls

{
    World w = null;
    
    public Level1Game(World w) 
    {
        this.w = w;
        
    }
    
    public void act() 
    {
        
        if (Greenfoot.mouseClicked(this)){  
             SharkWorld.gamelevel=1; 
            ((StartScreen)w).startGame();
           
        }
       
    }     
}
