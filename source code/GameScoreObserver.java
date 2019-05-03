import greenfoot.*;

public class GameScoreObserver implements Observer
{
    private String FISHSTRING = "Fishes : ";
    private String TURTLESTRING = "Turtles : ";
    private int fish=0, turtle=0;
    static int fishCnt, turtleCnt;
    public GameScoreObserver()
    {     
         
    }
    
    public void update(String item, GameMessage msg)
    {  
        Shark shark = (Shark) msg.getWorld().getObjects(Shark.class).get(0);
        if(item=="fish")
        {   
            fish++;    
        }
        else if (item=="turtle")
        {
            turtle++;  
        } 
        
        fishCnt = SharkWorld.fishCount - fish ;
        turtleCnt = SharkWorld.turtleCount - turtle;
        msg.setText(FISHSTRING + fishCnt +"\n"+ TURTLESTRING + turtleCnt);
    }
        
        
        
}
    