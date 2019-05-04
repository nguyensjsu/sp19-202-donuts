import greenfoot.*;

 /**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends Actor 
{
    private int level = SharkWorld.gamelevel;
    private GreenfootImage gfImage;
    private LevelStrategy levelStrategy; 
    public Level( )
    {
        gfImage = new GreenfootImage(200, 120); 
        gfImage.clear();
      
        gfImage.setColor(new Color(0, 0, 0, 40));
        gfImage.fillRect(0, 0, 100, 60);
        gfImage.setColor(new Color(255, 255, 255, 40));
        gfImage.fillRect(5, 5, 90, 50);
        gfImage.setColor(Color.WHITE);
        
        gfImage.drawString("Level: "+ level, 20, 25); 
        setImage(gfImage);
        setLevel(level);
    }
    
    public void setLevel(int level)
    {         
        switch(level)
        {
            case 1 : levelStrategy = new Level1Strategy();
                    break;
            case 2 : levelStrategy = new Level2Strategy();
                    break;
            default : levelStrategy = new Level1Strategy();
        }
        
       SharkWorld.fishCount = levelStrategy.setFishes();
       SharkWorld.turtleCount = levelStrategy.setTurtles();
       SharkWorld.hookCount = levelStrategy.setHooks();
     
    }
    
    public void act()
    {
       
    }
    
}
