import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class SharkWorld extends World
{
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
        Shark littleShark = new Shark();
        int children;
        int daughters = 18;
        int sons = 10;
        int sum= sons+daughters;
        sum = sons;
        int area; 
        area = 10 * 18;
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Shark shark = new Shark();
        addObject(shark,467,83);
        Hook hook = new Hook();
        addObject(hook,211,127);
        fish fish = new fish();
        addObject(fish,175,416);
        fish fish2 = new fish();
        addObject(fish2,424,445);
        fish fish3 = new fish();
        fish fish4 = new fish();
        addObject(fish4,311,258);
        fish fish5 = new fish();
        addObject(fish5,348,340);
        fish fish6 = new fish();
        addObject(fish6,477,257);
        fish fish7 = new fish();
        addObject(fish7,416,179);
        fish fish8 = new fish();
        addObject(fish8,477,326);
        fish fish9 = new fish();
        addObject(fish9,77,220);
        fish fish10 = new fish();
        addObject(fish10,234,239);
        fish fish11 = new fish();
        addObject(fish11,99,425);
        fish fish12 = new fish();
        addObject(fish12,217,511);
        fish fish13 = new fish();
        addObject(fish13,279,408);
        Hook hook2 = new Hook();
        addObject(hook2,490,442);
        Hook hook3 = new Hook();
        addObject(hook3,98,494);
        removeObject(fish5);
        removeObject(fish6);
        hook.setLocation(365,480);
        shark.setLocation(53,55);
        hook2.setLocation(505,506);
        hook.setLocation(300,454);
        Hook hook4 = new Hook();
        addObject(hook4,61,353);
        removeObject(hook);
        Hook hook5 = new Hook();
        addObject(hook5,388,335);
        fish9.setLocation(196,324);
        fish3.setLocation(319,373);
        fish6.setLocation(443,388);
        fish2.setLocation(377,489);
        fish8.setLocation(424,433);
        fish7.setLocation(497,358);
        fish8.setLocation(455,441);
        fish6.setLocation(389,416);
    }
}