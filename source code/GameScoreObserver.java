import greenfoot.*;


public class GameScoreObserver implements Observer
{
    private int fishCount = SharkWorld.fishCount;
    private int turtleCount = SharkWorld.turtleCount;
    private String FISHSTRING = "Fishes : ";
    private String TURTLESTRING = "Turtles : ";
    private int level = SharkWorld.gamelevel;
    public GameScoreObserver()
    {     
    }
    
    public void update(String item, GameMessage msg)
    {
       
        Shark shark = (Shark) msg.getWorld().getObjects(Shark.class).get(0);
        if(item=="fish")
        {    
            fishCount--;    
        }
        else if (item=="turtle")
        {
            turtleCount--;
        }
        
         
        if (fishCount == 0 && turtleCount == 0)
        {
            Greenfoot.playSound("Cheering.wav");
           
              Greenfoot.stop();
          
        }
        
        msg.setText(FISHSTRING + fishCount +"\n"+ TURTLESTRING + turtleCount);
    }
        
        
        
}
    