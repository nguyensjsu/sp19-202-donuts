import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class GameTitle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameTitle extends Actor
{
 
    public void act() 
    {
        if (Greenfoot.isKeyDown("ENTER"))
          Greenfoot.setWorld(new SharkWorld());
       
    }    
   
}
