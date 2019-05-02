import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class SharkWorld extends World
{
    
    Shark shark;  
    static int fishCount = 8, turtleCount = 4, hookCount = 2;
    static String FISHSTRING = "Fishes : ";
    static String TURTLESTRING = "Turtles : ";
    /**
     * Create the shark world (the beach). Our world has a size 
     * of 800x600 cells, where every cell is just 1 pixel.
     */
    public SharkWorld() 
    {
        super(800, 600, 1);
        int score;
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
      GameMessage msg = new GameMessage();
      addObject(msg, 800, 60);
      addItems(); // add items to the world
      shark = addSharkToWorld(); // adds Shark to the world and returns a reference to attach the observers
      attachObservers(shark); // attaches GameScoreObserver and GameSoundObserver to shark.
    }
    
    public Shark addSharkToWorld()
    {
      shark = new Shark();
      addObject(shark, Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
      return shark;
    }
      
    public void addItems()
    {
        for (int i=0; i<fishCount; i++)
        {
         Fish fish = new Fish();
         addObject(fish,Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        }
        for (int i=0; i<turtleCount; i++)
        {
         Turtle turtle = new Turtle();
         addObject(turtle,Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        } 
        for (int i=0; i<hookCount; i++)
        {
         Hook hook = new Hook();
         addObject(hook,Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        }
    }
    
    public void attachObservers(Shark shark)
    {
        shark.attach(new GameScoreObserver()); //attaching the GameScoreObserver
        shark.attach(new GameSoundObserver()); // attaching the GameSoundObserver
    }
}