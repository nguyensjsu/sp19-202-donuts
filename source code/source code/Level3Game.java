import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Level3Game extends GameControls
{
    World w = null;

    public Level3Game(World w)
    {
        this.w = w;

    }

    public void act()
    {

        if (Greenfoot.mouseClicked(this)){
             SharkWorld.gamelevel=3;
            ((StartScreen)w).startGame();


        }

    }
}
