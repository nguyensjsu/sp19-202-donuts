import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ExitGame extends GameControls
{
    World w = null;
	
    public ExitGame(World w) 
    {
       this.w = w;
    }
	
   
    public void act() 
    {
	if (Greenfoot.mouseClicked(this)) 
	   ((StartScreen)w).exitGame();
    }    
}
