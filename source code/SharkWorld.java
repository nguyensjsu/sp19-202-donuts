import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class SharkWorld extends World
{

    public Levels level;
    public Shark shark;
    int count = 0;
    /**
     * Create the shark world (the beach). Our world has a size
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public SharkWorld()
    {
        super(560, 560, 1);
        int score;
        boolean isHungry=true;
        int year=2015;
        //Shark littleShark = new Shark();
        int children;
        int daughters = 18;
        int sons = 10;
        int sum= sons+daughters;
        sum = sons;
        int area;
        area = 10 * 18;
        prepare();

    }

    public void act()
    {
        shark.move(5) ;
        lookForfish();
        checkKeyPress();
        switchImage();
    }

    public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            shark.turn (-6);
        }

        if (Greenfoot.isKeyDown("right"))
        {
            shark.turn(6);
        }
    }

    /**
     * Check whether we have stumbled upon a fish
     * If we have, eat it. if not, do nothing
     */
    public void lookForfish()
    {

        if ( shark.isTouchingWrapper(fish.class) )
        {
            shark.removeTouchingWrapper(fish.class);
            Greenfoot.playSound("bite.wav");

            shark.fishsEaten = shark.fishsEaten + 1;
            if (shark.fishsEaten == 2)
            {
                count++;
                Greenfoot.playSound("champions.wav");
                String levelLabel = "Level "+ String.valueOf(count) + " Completed";
                Label label = new Label(levelLabel);
                addObject(label,400, 280);
                if(count == 1){
                    level = new Level2();
                }
                else if(count == 2) {
                    level = new Level3();
                }
                else Greenfoot.stop();
                Greenfoot.delay(50);
                level.prepare(this);
                removeObject(label);
                shark.fishsEaten = 0;
            }
        }
    }

    public void switchImage()
    {
        shark.counter ++;
        if (shark.counter == 4)
        {
            if (shark.getImage () == shark.image1)
            {
                shark.setImage(shark.image2);
            }
            else
            {
                shark.setImage(shark.image1);
            }
            shark.counter = 0;
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
         level = new Level1();
         shark = new Shark();
         level.prepare(this);

    }
}