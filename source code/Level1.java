import greenfoot.*;

public class Level1 implements Levels {
    public Shark shark;
    public void prepare(SharkWorld sharkWorld) {
        shark =  sharkWorld.shark;
        sharkWorld.addObject(shark,467,83);
        Hook hook = new Hook();
        sharkWorld.addObject(hook,211,127);
        fish fish = new fish();
        sharkWorld.addObject(fish,175,416);
        fish fish2 = new fish();
        sharkWorld.addObject(fish2,424,445);
        fish fish3 = new fish();
        fish fish4 = new fish();
        sharkWorld.addObject(fish4,311,258);
        fish fish5 = new fish();
        sharkWorld.addObject(fish5,348,340);
        fish fish6 = new fish();
        sharkWorld.addObject(fish6,477,257);
        fish fish7 = new fish();
        sharkWorld.addObject(fish7,416,179);
        fish fish8 = new fish();
        sharkWorld.addObject(fish8,477,326);
        fish fish9 = new fish();
        sharkWorld.addObject(fish9,77,220);
        fish fish10 = new fish();
        sharkWorld.addObject(fish10,234,239);
        fish fish11 = new fish();
        sharkWorld.addObject(fish11,99,425);
        fish fish12 = new fish();
        sharkWorld.addObject(fish12,217,511);
        fish fish13 = new fish();
        sharkWorld.addObject(fish13,279,408);
        Hook hook2 = new Hook();
        sharkWorld.addObject(hook2,490,442);
        Hook hook3 = new Hook();
        sharkWorld.addObject(hook3,98,494);
        sharkWorld.removeObject(fish5);
        sharkWorld.removeObject(fish6);
        hook.setLocation(365,480);
        shark.setLocation(53,55);
        hook2.setLocation(505,506);
        hook.setLocation(300,454);
        Hook hook4 = new Hook();
        sharkWorld.addObject(hook4,61,353);
        sharkWorld.removeObject(hook);
        Hook hook5 = new Hook();
        sharkWorld.addObject(hook5,388,335);
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