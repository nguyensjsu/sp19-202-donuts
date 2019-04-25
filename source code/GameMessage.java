import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameMessage extends Actor
{
    GreenfootImage gfImage;
    private String initialCount = SharkWorld.FISHSTRING + SharkWorld.fishCount;
    public GameMessage()
    {

        gfImage = new GreenfootImage(200, 120); // create a new greenfoot image of size width = 200, height = 120
        gfImage.clear();
      
        gfImage.setColor(new Color(0, 0, 0, 40));
        gfImage.fillRect(0, 0, 100, 60);
        gfImage.setColor(new Color(255, 255, 255, 40));
        gfImage.fillRect(5, 5, 90, 50);
        gfImage.setColor(Color.WHITE);
        
        gfImage.drawString(initialCount, 20, 25); // Initialize the message with number of fishes
        setImage(gfImage);
    }
    
    public void act() 
    {
    }
    
    public void setText(String scoreString) // updates the message passed into it in the score box
    { 
        gfImage.clear(); 
        
        gfImage.setColor(new Color(0, 0, 0, 40));
        gfImage.fillRect(0, 0, 100, 60);
        gfImage.setColor(new Color(255, 255, 255, 40));
        gfImage.fillRect(5, 5, 90, 50);
        gfImage.setColor(Color.WHITE);
        
        gfImage.drawString(scoreString, 20, 25);
        setImage(gfImage);
    }
}