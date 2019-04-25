import greenfoot.*;


public class GameScoreObserver implements Observer
{
    private int fishCount = SharkWorld.fishCount;
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
             
       if (fishCount == 0 )
        {
            Greenfoot.playSound("Cheering.wav");
            Greenfoot.stop();
        }
        
        msg.setText(SharkWorld.FISHSTRING + fishCount);
    }
        
        
        
}
    