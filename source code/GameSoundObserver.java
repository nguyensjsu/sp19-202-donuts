import greenfoot.*;

public class GameSoundObserver implements Observer
{
    
    public GameSoundObserver()
    {
    }
    
    public void update(String item, GameMessage msg )
    {
        
        if(item=="fish")
        {
            Greenfoot.playSound("bite.wav");
        }
        else if(item=="turtle"){
            Greenfoot.playSound("slurp.wav");
        }
        else if(item=="shark" ){
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("hawk_screeching.wav");
        }
       
        
        
    }
        
        
        
}