import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class SharkWorld extends greenfoot.World
{
    ObjectFactory objectFactory = new ObjectFactory();
    Objects newObject = null;
    Shark shark;
    //static int fishCount, turtleCount=3, hookCount=2;
    static int fishCount, turtleCount, hookCount;
    static int gamelevel;
    /**
     * Create the shark world (the beach). Our world has a size 
     * of 800x600 cells, where every cell is just 1 pixel.
     */
    public SharkWorld() 
    {
        super(800, 500, 1);    
        int score;
        prepare();
    }

    private void prepare()
    {
      Level level = new Level();
      addObject(level, 100,60);
      
      GameMessage msg = new GameMessage();
      addObject(msg, 800, 60);
      
      addItems(); // add items to the world
      shark = addSharkToWorld(); // adds Shark to the world and returns a reference to attach the observers
      attachObservers(shark); // attaches GameScoreObserver and GameSoundObserver to shark.
    }
    
    public Shark addSharkToWorld()
    {
      shark = new Shark();

      addObject(shark, Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(500));
      return shark;
    }
     
    public void addItems()
    {
       
        for (int i=0; i<fishCount; i++)
        { 
            newObject = objectFactory.createObject("fish");
            addObject(newObject, Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(500));
        }
        for (int i=0; i<turtleCount; i++)
         { 
            newObject = objectFactory.createObject("turtle");
            addObject(newObject, Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(500));
         }
        for (int i=0; i<hookCount; i++)
        { 
            newObject = objectFactory.createObject("hook");
            addObject(newObject, Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(500));
        }
    }
    public void attachObservers(Shark shark)
    {
        shark.attach(new GameScoreObserver()); //attaching the GameScoreObserver
        shark.attach(new GameSoundObserver()); // attaching the GameSoundObserver
       // shark.attach(new Level());
    }
   
    
}